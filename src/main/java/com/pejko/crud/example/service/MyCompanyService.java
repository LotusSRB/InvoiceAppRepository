package com.pejko.crud.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pejko.crud.example.entity.MyCompany;
import com.pejko.crud.example.repository.MyCompanyRepository;

@Service
public class MyCompanyService {

	@Autowired
	private MyCompanyRepository repository;
	
	public MyCompany saveMyCompany(MyCompany myCompany) {
		return repository.save(myCompany);
	}

	public MyCompany getMyCompany() {
		return repository.findById(1).orElse(null);
	}
	
	public MyCompany updateMyCompany(MyCompany newCompany) {
		MyCompany existingCompany = repository.findById(newCompany.getId()).orElse(null);
		existingCompany.setName(newCompany.getName());
		existingCompany.setAddress(newCompany.getAddress());
		existingCompany.setBankAccount(newCompany.getBankAccount());
		existingCompany.setCity(newCompany.getCity());
		existingCompany.setMb(newCompany.getMb());
		existingCompany.setPhoneNumber(newCompany.getPhoneNumber());
		existingCompany.setPib(newCompany.getPib());
		existingCompany.setZip(newCompany.getZip());
		return repository.save(existingCompany);
	}

}