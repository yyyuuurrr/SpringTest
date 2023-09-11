package com.yuuur.spring.test.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.jpa.domain.Company;
import com.yuuur.spring.test.jpa.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company addCompany(String name, String business, String scale, int headcount) {
		
		Company company = Company.builder()
							.name(name)
							.business(business)
							.scale(scale)
							.headcount(headcount)
							.build();
		
		company = companyRepository.save(company);
		
		return company;
	}
}
