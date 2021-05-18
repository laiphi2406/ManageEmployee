package com.ManageEmployee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ManageEmployee.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("IT");
		menus.add("Dev5");
		
		return menus;
	}

}
