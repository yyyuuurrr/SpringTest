package com.yuuur.spring.test.ajax;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	
	@PostMapping("/insert")
	public String insertBooking(@RequestParam("name")String name
			, @RequestParam("date") @DateTimeFormat(pattern = "yyyy년MM월dd일") Date date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber")String phoneNumber
			, @RequestParam(value="state", defaultValue="예약중")String state) {
		
		int count = bookingService.insertBooking(name, date, day, headcount, phoneNumber, state);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) { // 성공
			resultMap.put("result", "success");
			
		}else { //실패
			resultMap.put("result", "fail");
		}
		
		
		return "redirect:/ajax/booking/list";
		
		
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteBooking(@RequestParam("id") int id) {
		
		int count = bookingService.deleteBooking(id);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) { // 성공
			resultMap.put("result", "success");
			
		}else { //실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	

	@GetMapping("/main")
	public String checkbooking() {
		
		return "/ajax/booking/check";
	}
	
	
	// 이름과 전화번호를 전달받고 일치하는 예약정보를 response에 json에 담아주는 API
	@GetMapping("/search")
	@ResponseBody
	public Booking searchBooking(@RequestParam("name")String name
			, @RequestParam("phoneNumber")String phoneNumber){
		
		Booking booking = bookingService.getBooking(name, phoneNumber);
		
		// {"name":"김인규", "date":2023-09-04, "day":2 .....}
	
		// 응답 json에 조회된 데이터가 있는지 없는지 정보를 명확하게 정의 한다
		
		
		
		
		
		return booking;
	}
}
