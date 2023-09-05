package com.yuuur.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlListController {
	
	@GetMapping("/ajax/list")
	public String urlList() {
		
		return "/ajax/urlList/list";
	}

}
