package com.yuuur.spring.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuuur.spring.test.jpa.domain.Recruit;
import com.yuuur.spring.test.jpa.repository.RecruitRepository;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/select")
	@ResponseBody
	public List<Recruit> selectRecruit() {
		
		List<Recruit> recruitList = recruitRepository.findById(8);
		
		return recruitList;		
	}
	
	
	@GetMapping("/select2")
	@ResponseBody
	public List<Recruit> selectRecruit2(@RequestParam("companyId") int id){
		
		List<Recruit> recruitList = recruitRepository.findByCompanyId(id);
		
		return recruitList;
	}
	
	
	@GetMapping("/select3")
	@ResponseBody
	public List<Recruit> selectRecruit3(){
		
		List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return recruitList;
	}
	
	
	@GetMapping("/select4")
	@ResponseBody
	public List<Recruit> selectRecruit4(){
		
		List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
		
		return recruitList;
		
	}
	
	@GetMapping("/select5")
	@ResponseBody
	public List<Recruit> selectRecruit5(){
		
		List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
		return recruitList;
	}
//	
//	@GetMapping("/select6")
//	@ResponseBody
//	public List<Recruit> selectRecruit6(){
//		
//		return recruitRepository.findByRegionANDsalaryBetween("성남시 분당구", 7000, 8500);
//
//	}
	
	
	@GetMapping("/select7")
	@ResponseBody
	public List<Recruit> selectRecruit7(){
		
		return recruitRepository.findByNativeQuery("2026-04-10 00:00:00", 8100, "정규직");

	}
	
	

}
