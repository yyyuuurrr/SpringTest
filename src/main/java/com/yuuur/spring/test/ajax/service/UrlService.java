package com.yuuur.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuuur.spring.test.ajax.domain.Url;
import com.yuuur.spring.test.ajax.repository.UrlRepository;

@Service
public class UrlService {
	
	@Autowired
	private UrlRepository urlRepository;
	
	
	public List<Url> getUrl() {
		
		List<Url> urlList = urlRepository.selectUrl();
		
		return urlList;
	}
	
	public int addUrl(String name, String url) {
		
		int count =  urlRepository.insertUrl(name, url);
		
		return count;
	}
	
	
	// url 중복확인
	public boolean isDuplicateUrl(String url) {
		
		int count = urlRepository.selectCountUrl(url);
		
//		if(count == 0) {
//			
//			return false;
//		}else {
//			
//			return true;
//		}
		
		return count != 0;

	}
	
	
	

}
