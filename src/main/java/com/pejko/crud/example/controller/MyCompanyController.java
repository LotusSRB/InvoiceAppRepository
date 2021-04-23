package com.pejko.crud.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pejko.crud.example.entity.MyCompany;
import com.pejko.crud.example.service.MyCompanyService;

@RestController
@RequestMapping("/myCompany")
public class MyCompanyController {
	
	private MyCompanyService service;
	
	@PostMapping("/add")
	public MyCompany addMyCompany(@RequestBody MyCompany myCompany) {
		return service.saveMyCompany(myCompany);
	}
	
	@GetMapping("/find")
	public MyCompany find() {
		return service.getMyCompany();
	}
	
	@PutMapping("/update")
	public MyCompany updateMyCompany(@RequestBody MyCompany myCompany) {
		return service.updateMyCompany(myCompany);
	}

}
