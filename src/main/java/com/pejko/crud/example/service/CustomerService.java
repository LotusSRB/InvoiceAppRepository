package com.pejko.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pejko.crud.example.entity.Customer;
import com.pejko.crud.example.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> saveCustomers(List<Customer> customers) {
		return repository.saveAll(customers);
	}

	public List<Customer> getCustomers() {
		return repository.findAll();
	}

	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Customer getCustomerByName(String name) {
		return repository.findByName(name);
	}

	public Customer getCustomerByPib(String pib) {
		return repository.findByName(pib);
	}

	public Customer getCustomerByMb(String mb) {
		return repository.findByName(mb);
	}

	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "Customer with id " + id + " deleted";
	}

	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
		existingCustomer.setName(customer.getName());
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setBankAccount(customer.getBankAccount());
		existingCustomer.setCity(customer.getCity());
		existingCustomer.setMb(customer.getMb());
		existingCustomer.setPhoneNumber(customer.getPhoneNumber());
		existingCustomer.setPib(customer.getPib());
		existingCustomer.setZip(customer.getZip());
		return repository.save(existingCustomer);
	}

}
