package com.yuuur.spring.test.test01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Cotroller {
	
	@RequestMapping("/lifecycle/test03")
	public String test03View() {
		return "lifecycle/test03";
	}
}
