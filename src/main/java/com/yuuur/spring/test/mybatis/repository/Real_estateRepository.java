package com.yuuur.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.mybatis.domain.Real_estate;

@Repository
public interface Real_estateRepository {
	
	public Real_estate selectReal(@Param("id")int id);
	
	// 파라미터로 전달 받은 월세보다 낮은 정보돌려주는 기능
	public List<Real_estate> selectReal2(@Param("rent")int rentPrice);

}
