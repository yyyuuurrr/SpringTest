package com.yuuur.spring.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.jsp.domain.Realtor;


@Repository
public interface RealtorRepository {
	
	
	public int insertRealtor(@Param("office")String office
			, @Param("phoneNumber")String phoneNumber
			, @Param("address")String address
			, @Param("grade")String grade);
	

	public Realtor selectLastRealtor();
	
	public int insertRealtorByObject(Realtor realtor);
}
