package com.yuuur.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.ajax.domain.Url;

@Repository
public interface UrlRepository {

	
	public List<Url> selectUrl();
	
	
	public int insertUrl(@Param("name") String name
			, @Param("url") String url);
	
	
	public int selectCountUrl(@Param("url")String url);
	
	
	public int deleteUrl(@Param("id")int id);
}
