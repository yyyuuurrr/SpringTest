package com.yuuur.spring.test.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.database.domain.Store;

@Repository
public interface StoreRepository {

	// store 테이블 모든행 조회
	public List<Store> selectStoreList();
}
