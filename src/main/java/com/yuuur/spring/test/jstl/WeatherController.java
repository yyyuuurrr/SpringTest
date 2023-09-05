package com.yuuur.spring.test.jstl;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuuur.spring.test.jstl.domain.Weatherhistory;
import com.yuuur.spring.test.jstl.service.WeatherhistoryService;

@RequestMapping("/jstl/weatherhistory")
@Controller
public class WeatherController {
	
	@Autowired
	private WeatherhistoryService weatherhistoryService;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime dateWithLDT;
	
	
	@GetMapping("/main")
	public String weatherhistory(Model model) {
		
		List<Weatherhistory> weatherhistoryList = weatherhistoryService.getWeatherhistory();

		model.addAttribute("weatherhistoryList", weatherhistoryList);

		return "/jstl/test05";
	}

	
	@GetMapping("/input")
	public String weatherhistoryInput() {
		
		return "jstl/test05Input";

	}
	
	
	@PostMapping("/insert")
	public String insertWeather(
			@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("microDust") String microDust
			, @RequestParam("temperatures")double temperatures
			, @RequestParam("precipitation")double precipitation
			, @RequestParam("windSpeed")double windSpeed) {
		
		int count = weatherhistoryService.addWeather(date, weather, microDust, temperatures, precipitation, windSpeed);
		
		
		
		return "redirect:/jstl/weatherhistory/main";
	}
	
	
	
	
}
