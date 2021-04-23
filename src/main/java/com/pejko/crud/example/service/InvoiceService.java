package com.pejko.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pejko.crud.example.entity.Invoice;
import com.pejko.crud.example.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository repository;

	public Invoice saveInvoice(Invoice invoice) {
		return repository.save(invoice);
	}

	public List<Invoice> getInvoices() {
		return repository.findAll();
	}
	
	public Invoice getInvoiceById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Invoice getInvoiceByNumber(String invoiceNumber) {
		return repository.findByInvoiceNumber(invoiceNumber);
	}

	public String deleteInvoice(int id) {
		repository.deleteById(id);
		return "invoice deleted " + id;
	}

	public Invoice updateInvoice(Invoice invoice) {
		Invoice existingInvoice = repository.findById(invoice.getId()).orElse(null);
		existingInvoice.setInvoiceNumber(invoice.getInvoiceNumber());
		existingInvoice.setDate(invoice.getDate());
		existingInvoice.setItems(invoice.getItems());
		return repository.save(existingInvoice);
	}

}
