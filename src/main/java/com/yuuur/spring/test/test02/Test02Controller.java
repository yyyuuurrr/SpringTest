package com.yuuur.spring.test.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test02")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> movieResponse() {
		
		List<Map<String, Object>> movieList = new ArrayList<Map<String, Object>>();

		Map<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("rate", 15);
		map1.put("director", "봉준호");
		map1.put("time", 131);
		map1.put("title", "기생충");
		
		movieList.add(map1);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		map2.put("rate", 0);
		map2.put("director", "로베르토 베니니");
		map2.put("time", 116);
		map2.put("title", "인생은 아름다워");
		
		movieList.add(map2);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		
		map3.put("rate", 12);
		map3.put("director", "크리스토퍼 놀란");
		map3.put("time", 147);
		map3.put("title", "인셉션");
		
		movieList.add(map3);
		
		Map<String, Object> map4 = new HashMap<String, Object>();
		
		map4.put("rate", 19);
		map4.put("director", "윤종빈");
		map4.put("time", 133);
		map4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		
		movieList.add(map4);
		
		Map<String, Object> map5 = new HashMap<String, Object>();
		
		map5.put("rate", 15);
		map5.put("director", "프란시스 로렌스");
		map5.put("time", 137);
		map5.put("title", "헝거게임");
		
		movieList.add(map5);
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<Map<String, Object>> infoMap() {
		
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();

		Map<String, Object> infoMap1 = new HashMap<String, Object>();
		
		infoMap1.put("title", "안녕하세요 가입인사 드립니다.");
		infoMap1.put("user", "hagulu");
		infoMap1.put("content", "안녕하세요. 앞으로 잘 부탁드립니다.");
		
		listMap.add(infoMap1);
		
		Map<String, Object> infoMap2 = new HashMap<String, Object>();
		
		infoMap2.put("title", "헐 대박");
		infoMap2.put("user", "bada");
		infoMap2.put("content", "오늘 목요일이었어... 금요일인줄");

		listMap.add(infoMap2);
		
		Map<String, Object> infoMap3 = new HashMap<String, Object>();
		
		infoMap3.put("title", "오늘 데이트 한 이야기 해드릴게요.");
		infoMap3.put("user", "dulumary");
		infoMap3.put("content", "......");
		
		listMap.add(infoMap3);
		
		return listMap;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Join> joinError() {
		
		Join join = new Join("안녕하세요 가입인사 드립니다.", "hagulu", "안녕하세요. 앞으로 잘 부탁드립니다.");
		
		ResponseEntity<Join> entity = new ResponseEntity(join, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}
	
	
	
	
	

}
