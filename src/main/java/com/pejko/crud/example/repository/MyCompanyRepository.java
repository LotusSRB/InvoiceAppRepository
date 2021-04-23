package com.pejko.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pejko.crud.example.entity.MyCompany;

public interface MyCompanyRepository extends JpaRepository<MyCompany, Integer> {

}
