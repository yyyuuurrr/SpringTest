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

	
	// 파라미터로 전달 받은 넓이보다 큰, 전달받은 가격 이하 정보 돌려주는 기능
	public List<Real_estate> selectRealComplex(@Param("area")int area, @Param("price")int price);
	
	// 전달된 insert 내용을 insert 하는 기능
	public int insertReal(@Param("realtorId")int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price);
	
	
	// 객체 insert 2번
	public int insertReal2(@Param("realtorId")int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price);
	
	
	// update 
	public int updateReal(@Param("type")String type, @Param("price")int price);
	
	
	
}
