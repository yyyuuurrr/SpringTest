package com.yuuur.spring.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuuur.spring.test.database.Service.StoreService;
import com.yuuur.spring.test.database.domain.Store;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService; 

	@RequestMapping("/db/store/list")
	@ResponseBody
	public List<Store> storeList() {
		
		List<Store> storeList = storeService.getStoreList();
		
		return storeList;
	}
	
}
