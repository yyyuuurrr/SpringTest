package com.yuuur.spring.test.ajax.service;

import java.util.Date;
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

	public int insertBooking(String name, Date date, int day, int headcount, String phoneNumber, String state) {
		
		int count = bookingRepository.insertBooking(name, date, day, headcount, phoneNumber, state);
		
		return count;
	}
	// delete
	public int deleteBooking(int id) {
		
		int count = bookingRepository.deleteBooking(id);
		
		return count;
		
	}
	
	// 예약 정보 한행 조회
	public Booking getBooking(String name, String phoneNumber) {
		
		Booking booking = bookingRepository.checkBooking(name, phoneNumber);
		
		return booking;
	}
}
