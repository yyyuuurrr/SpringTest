package com.yuuur.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.jsp.domain.Realtor;
import com.yuuur.spring.test.jsp.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;

	public int addRealtor(String office, String phoneNumber, String address, String grade) {
		int count = realtorRepository.insertRealtor(office, phoneNumber, address, grade);
		
		return count;
	}
	
	
	public Realtor getLastRealtor() {
		
		Realtor realtor = realtorRepository.selectLastRealtor();
		
		return realtor;
	}
	
	
	public int addRealtorByObject(Realtor realtor) {
		int count = realtorRepository.insertRealtorByObject(realtor);
		
		return count;
	}
}
