package com.pejko.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pejko.crud.example.entity.Invoice;
import com.pejko.crud.example.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceService service;

	@PostMapping("/add")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return service.saveInvoice(invoice);
	}
	
	@GetMapping("/findAll")
	public List<Invoice> findAllInvoices(){
		return service.getInvoices();
	}
	
	@GetMapping("/findById/{id}")
	public Invoice findInvoiceById(@PathVariable int id) {
		return service.getInvoiceById(id);
	}
	
	@GetMapping("/findByInvoiceNumber/{invoiceNumber}")
	public Invoice findInvoiceById(@PathVariable String invoiceNumber) {
		return service.getInvoiceByNumber(invoiceNumber);
	}
	
	@PutMapping("/update")
	public Invoice updateInvoice(@RequestBody Invoice invoice) {
		return service.updateInvoice(invoice);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInvoice(@PathVariable int id) {
		service.deleteInvoice(id);
		return "invoice deleted " + id;
	}
	
	
}
