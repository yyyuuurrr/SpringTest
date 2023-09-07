package com.yuuur.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuuur.spring.test.ajax.domain.Booking;
import com.yuuur.spring.test.ajax.service.BookingService;

@RequestMapping("/ajax/booking")
@Controller
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@GetMapping("/list")
	public List<Booking> bookingList(Model model) {
		
		List<Booking> bookingList = bookingService.bookingList();
				
		model.addAttribute("bookingList", bookingList);
		
		return bookingList;
	}
	
	
	@GetMapping("/input")
	public String inputbooking() {
		
		return "/ajax/booking/input";
	}

}
