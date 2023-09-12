package com.yuuur.spring.test.jpa.service;

import java.util.Optional;

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
	
	
	public Company updateCompany(int id, String scale, int headcount) {
		
		// id로 수정대상 행 조회
		Optional<Company> optionalCompany = companyRepository.findById(id);
		
		Company company = optionalCompany.orElse(null);
		
		if(company != null) {
			company = company.toBuilder()
						.scale(scale)
						.headcount(headcount)
						.build();
			
			company = companyRepository.save(company);
		}
		
		return company;
		
	}
	
	public void deleteCompany(int id) {
		
		// id 기반으로 한행을 조회
		// 조회된 객체로 해당 행 삭제
		Optional<Company> optioanalCompany = companyRepository.findById(id);
		
		optioanalCompany.ifPresent(company -> companyRepository.delete(company));
		
	}
	
	
	
	
}
