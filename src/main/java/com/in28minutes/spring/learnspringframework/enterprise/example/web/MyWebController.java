package com.in28minutes.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.business.BusinesService;

@Component
public class MyWebController {
	
	@Autowired
	private BusinesService businessService;
	
	
	
	public MyWebController(BusinesService businessService) {
		super();
		System.out.println("Constructor Injection in MyWebController");
		this.businessService = businessService;
	}



	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}

}

