package com.yuuur.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuuur.spring.test.mybatis.domain.Real_estate;
import com.yuuur.spring.test.mybatis.service.Real_estateService;

@Controller
@RequestMapping("/mybatis/real")
public class Real_estateController {
	
	@Autowired
	private Real_estateService real_estateService;
	
	@RequestMapping("/1")
	@ResponseBody
	public Real_estate real_estate(@RequestParam("id") int id) {
		Real_estate real_estate = real_estateService.getReal(id);
		
		return real_estate;
	}

	
	@RequestMapping("/2")
	@ResponseBody
	public List<Real_estate> real_estate2(@RequestParam("rent")int rentPrice) {
		List<Real_estate> real_estateList = real_estateService.getReal2(rentPrice);
		
		return real_estateList;
		
	}
	
	@RequestMapping("/3")
	@ResponseBody
	public List<Real_estate> selectRealComplex(@RequestParam("area")int area, @RequestParam("price")int price) {
		List<Real_estate> realList = real_estateService.getReal3(area, price);
		
		return realList;
	}
	
	
	// insert 하기
	@RequestMapping("/4")
	@ResponseBody
	public String createReal(@RequestParam("realtorId")int realtorId) {
		
		//int count = real_estateService.addReal(3, "푸르지용 리버 303동 1104호", 89, "매매", 100000);
		
		
		int count = real_estateService.addReal2(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000);
		
		return "입력성공 : " + count;
	}
	
	// update 하기
	@ResponseBody
	@RequestMapping("/update")
	public String updateReal(String type, int price) {
		
		int count = real_estateService.updateReal("전세", 70000);
		
		return "수정 성공 : " + count;
	}


}
