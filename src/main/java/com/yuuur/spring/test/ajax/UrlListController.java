package com.yuuur.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuuur.spring.test.ajax.domain.Url;
import com.yuuur.spring.test.ajax.service.UrlService;

@RequestMapping("/ajax/url")
@Controller
public class UrlListController {
	
	@Autowired
	public UrlService urlService;
	
	
	@GetMapping("/list")
	public List<Url> urlList(Model model) {
		
		List<Url> urlList = urlService.getUrl();
		
		model.addAttribute("urlList", urlList);
		
		return urlList;
	}
	
	
	@PostMapping("/create")
	@ResponseBody
	public Map<String, String> createUrl(@RequestParam("name")String name
			, @RequestParam("url") String url) {
		
		int count = urlService.addUrl(name, url);
		
		// 성공, 실패시 json형태
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) { // 성공
			resultMap.put("result", "success");
			
		}else { //실패
			resultMap.put("result", "fail");
		}
				
		return resultMap;
	}
	
	
	
	@GetMapping("/input")
	public String urlInput() {
			
		return "/ajax/url/input";
	}
	
	// 중복url
	@PostMapping("/duplicate-url")
	@ResponseBody
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		
		boolean isDuplicate =  urlService.isDuplicateUrl(url);
		
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(isDuplicate) {
			//중복됨
			resultMap.put("isDuplicate", true);
		}else {
			//중복안됨
			resultMap.put("isDuplicate", false);
			
		}
		
		return resultMap;
		
		
	}
	
	
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteUrl(@RequestParam("id")int id) {
		
		int count = urlService.deleteUrl(id);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) { // 성공
			resultMap.put("result", "success");
			
		}else { //실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	
	
	
	
	
	
	

}
