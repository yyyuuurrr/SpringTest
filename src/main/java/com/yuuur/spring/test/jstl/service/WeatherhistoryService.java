package com.yuuur.spring.test.jstl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.jstl.domain.Weatherhistory;
import com.yuuur.spring.test.jstl.repository.WeatherhistoryRepository;

@Service
public class WeatherhistoryService {
	
	@Autowired
	private WeatherhistoryRepository weatherhistoryRepository;

	
	public List<Weatherhistory> getWeatherhistory() {

		List<Weatherhistory> weatherhistoryList = weatherhistoryRepository.selectWeatherhistory();

		return weatherhistoryList;

	}
	
	public int addWeather(Date date, String weather, String microDust
			, double temperatures, double precipitation, double windSpeed) {
		
		
		int count = weatherhistoryRepository.insertWeatherhistory(date, weather, precipitation, temperatures, microDust, windSpeed);
		
		return count;
		
	}
	

}
