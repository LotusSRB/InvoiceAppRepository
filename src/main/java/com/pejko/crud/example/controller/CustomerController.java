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

import com.pejko.crud.example.entity.Customer;
import com.pejko.crud.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}

	@PostMapping("/addMore")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
		return service.saveCustomers(customers);
	}

	@GetMapping("/findAll")
	public List<Customer> findAllCustomers() {
		return service.getCustomers();
	}

	@GetMapping("/findById/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}

	@GetMapping("/findByName/{name}")
	public Customer findCustomerByName(@PathVariable String name) {
		return service.getCustomerByName(name);
	}
	
	@GetMapping("/findByPib/{pib}")
	public Customer findCustomerByPib(@PathVariable String pib) {
		return service.getCustomerByPib(pib);
	}
	
	@GetMapping("/findByMb/{mb}")
	public Customer findCustomerByMb(@PathVariable String mb) {
		return service.getCustomerByMb(mb);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return service.deleteCustomer(id);
	}

}
