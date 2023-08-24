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
	
	// 파라미터로 전달 받은 월세보다 낮은 정보조회
	public List<Real_estate> getReal2(int rentPrice) {
		List<Real_estate> real_estateList = real_estateRepository.selectReal2(rentPrice);
		
		return real_estateList;
	}

}
