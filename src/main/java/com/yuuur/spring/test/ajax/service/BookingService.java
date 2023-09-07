package com.yuuur.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.ajax.domain.Booking;
import com.yuuur.spring.test.ajax.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	
	public List<Booking> bookingList() {
		
		List<Booking> bookingList = bookingRepository.selectBooking();
		
		return bookingList;
	}

}
