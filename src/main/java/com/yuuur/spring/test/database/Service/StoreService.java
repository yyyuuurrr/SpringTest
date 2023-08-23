package com.yuuur.spring.test.database.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.database.domain.Store;
import com.yuuur.spring.test.database.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	// store 모든 데이터 조회
	public List<Store> getStoreList() {
		
		List<Store> storeList = storeRepository.selectStoreList();
		
		return storeList;
	}

}
