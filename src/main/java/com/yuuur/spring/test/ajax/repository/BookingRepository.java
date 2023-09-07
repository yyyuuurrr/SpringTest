package com.yuuur.spring.test.ajax.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.ajax.domain.Booking;

@Repository
public interface BookingRepository {

	
	public List<Booking> selectBooking();
	
	
	
}
