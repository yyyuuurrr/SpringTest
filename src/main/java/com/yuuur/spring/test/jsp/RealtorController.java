package com.yuuur.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuuur.spring.test.jsp.service.RealtorService;

@RequestMapping("/jsp/realtor")
@Controller
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;

	@PostMapping("/create")
	public String createRealtor(@RequestParam("office") String office
			, @RequestParam("phoneNumber")String phoneNumber
			, @RequestParam("address")String address
			, @RequestParam("grade")String grade){
		
		int count = realtorService.addRealtor(office, phoneNumber, address, grade);
		
		return "추가 완료 : " + count;
	}
	
	@GetMapping("/input")
	public String inputRealtor() {
		
		return "jsp/realtorInput";
	}
	
}
