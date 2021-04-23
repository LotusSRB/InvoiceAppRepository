package com.pejko.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pejko.crud.example.dto.InvoiceCreator;
import com.pejko.crud.example.entity.Customer;
import com.pejko.crud.example.service.CustomerService;
import com.pejko.crud.example.service.InvoiceService;

@RestController
@RequestMapping("/invoiceCreator")
public class InvoiceCreatorController {
	
	@Autowired
	private CustomerService customerService;;
	@Autowired
	private InvoiceService invoiceService;

	@PostMapping("/createInvoice")
	public Customer createInvoice (@RequestBody InvoiceCreator invoiceCreator) {
		return customerService.saveCustomer(invoiceCreator.getCustomer());
	}
	
	@GetMapping("/listAll")
	public List<Customer> findAllInvoices(){
		return customerService.getCustomers();
	}
	
}
