package com.yuuur.spring.test.jstl.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.jstl.domain.Weatherhistory;

@Repository	
public interface WeatherhistoryRepository {
	

	public List<Weatherhistory> selectWeatherhistory();
	
	
	public int insertWeatherhistory(@Param("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date
			, @Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation")double precipitation
			, @Param("microDust")String microDust
			, @Param("windSpeed") double windSpeed);
	
	
}
