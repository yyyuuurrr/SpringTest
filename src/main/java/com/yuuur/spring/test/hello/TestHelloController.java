package com.yuuur.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String helloworld() {
		return "Hello world";
		
	}
	
}
