package com.yuuur.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.mybatis.domain.Real_estate;
import com.yuuur.spring.test.mybatis.repository.Real_estateRepository;

@Service
public class Real_estateService {
	
	@Autowired
	private Real_estateRepository real_estateRepository;
	
	// id정보 조회
	public Real_estate getReal(int id) {		
		Real_estate real_estate = real_estateRepository.selectReal(id);
		
		return real_estate;
		
	}
	
	// 파라미터로 전달 받은 월세보다 낮은 정보조회 기능
	public List<Real_estate> getReal2(int rentPrice) {
		List<Real_estate> real_estateList = real_estateRepository.selectReal2(rentPrice);
		
		return real_estateList;
	}
	
	
	// 파리미터로 전달 받은 면적, 가격 이하 정보 기능
	public List<Real_estate> getReal3(int area, int price) {
		List<Real_estate> realList = real_estateRepository.selectRealComplex(area, price);
		
		return realList;
	}
	
	// 전달받은  insert 내용 저장 기능
	public int addReal(int realtorId, String address, int area, String type, int price) {
		
		int count = real_estateRepository.insertReal(realtorId, address, area, type, price);
		
		return count;
	}
	
	// insert 2번
	public int addReal2(int realtorId
			, String address
			, int area
			, String type
			, int price) {
		int count = real_estateRepository.insertReal2(realtorId, address, area, type, price);
		
		return count;
	}
	
	//  update 
	
	public int updateReal(String type, int price) {
		int count = real_estateRepository.updateReal(type, price);
		
		return count;
	}
	
}
