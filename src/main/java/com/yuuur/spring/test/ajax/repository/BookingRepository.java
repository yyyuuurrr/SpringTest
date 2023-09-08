package com.yuuur.spring.test.ajax.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.ajax.domain.Booking;

@Repository
public interface BookingRepository {

	
	public List<Booking> selectBooking();
	
	public int insertBooking(@Param("name") String name
			, @Param("date")  @DateTimeFormat(pattern = "yyyy년MM월dd일") Date date
			, @Param("day") int day
			, @Param("headcount") int headcount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state);
	
	// 한행 조회
	public Booking checkBooking(@Param("name") String name
			, @Param("phoneNumber") String phoneNumber);
	

	public int deleteBooking(@Param("id")int id);
	

	
}
