package com.yuuur.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.jsp.domain.Seller;
import com.yuuur.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		
		int count = sellerRepository.insertSeller(nickname, profileImage, temperature);
		
		return count;
	}
	
	public Seller getLastSeller() {
		
		Seller seller = sellerRepository.selectSellerLast();
		
		return seller;		
	}
	
	public Seller getSeller(int id) {
		
		Seller seller = sellerRepository.selectSeller(id);
		
		return seller;
	}
	
}
