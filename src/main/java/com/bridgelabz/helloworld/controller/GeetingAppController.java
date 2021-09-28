package com.bridgelabz.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@RestController
public class GeetingAppController {
	@SuppressWarnings("unchecked")
	@RequestMapping("/json/param/{firstName}/{lastName}")
	public JSONObject jsonObject(@PathVariable String firstName, @PathVariable String lastName) {
		JSONObject job = new JSONObject();
		job.put(firstName, lastName);
		return job;
	}
	@RequestMapping("/welcome")
	public String welcomeMssg() {
		return "Hello World";
	}
}
