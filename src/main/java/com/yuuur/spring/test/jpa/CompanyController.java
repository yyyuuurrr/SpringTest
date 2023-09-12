package com.yuuur.spring.test.jpa;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuuur.spring.test.jpa.domain.Company;
import com.yuuur.spring.test.jpa.service.CompanyService;

@RequestMapping("/jpa/company")
@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	@GetMapping("/create")
	@ResponseBody
	public List<Company> createCompany() {
		
//		String name = "버블팡";
//		String business = "여신 금융업";
//		String scale = "대기업";
//		int headcount = 6834;
//		
//		Company company = companyService.addCompany(name, business, scale, headcount);
		
		List<Company> companyList = new ArrayList<>();
		
		Company company = companyService.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
		companyList.add(company);
		
		company = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		companyList.add(company);
		
		return companyList;		
	}
	
	
	
	@GetMapping("/update")
	@ResponseBody
	public Company updateCompany() {
		
		Company company = companyService.updateCompany(8, "중소기업", 34);
		
		return company;
		
	}
	
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteCompany() {
		
		companyService.deleteCompany(9);
		
		return "삭제 성공";
	}
	
	
	
		
}
