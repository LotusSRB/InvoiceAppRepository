package com.pejko.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pejko.crud.example.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

	Invoice findByInvoiceNumber(String invoiceNumber);
	
}
