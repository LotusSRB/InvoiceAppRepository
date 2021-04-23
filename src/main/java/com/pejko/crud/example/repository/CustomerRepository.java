package com.pejko.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pejko.crud.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findByName(String name);
	Customer findByPib(String pib);
	Customer findByMb(String mb);
	
}
