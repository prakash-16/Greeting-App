package com.bridgelabz.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bridgelabz.helloworld.model.GreetingAppDetails;

@Controller
public class GreetingAppWebController {
	
	@Autowired
	AppRepo app;
	@GetMapping("/addMssg")
	public String addMssg(GreetingAppDetails det) {
		app.save(det);
		return "welcome";
	}
}
