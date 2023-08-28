package com.yuuur.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuuur.spring.test.jsp.service.SellerService;

@RequestMapping("/jsp/seller")
@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;

	@GetMapping("/create")
	public String createSeller(
			@RequestParam("nickname")String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature
			) {
		
		int count = sellerService.addSeller(nickname, profileImage, temperature);
		
		return "수행결과 : " + count;
	}
	
	@GetMapping("/insert")
	public String insertSeller() {
		
		return "jsp/sellerInput";
		
	}
	
	
}
