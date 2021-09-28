package com.bridgelabz.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = {"/greet/user"}, method = RequestMethod.GET)
	public String greetUser(@RequestParam(value = "firstName", required = false) String firstName, @RequestParam(value = "lastName", required = false) String lastName) {
		if(firstName == null && lastName == null) {
			return "Hello World";
		}
		else if(firstName == null) {
			return "Hello Mr." + lastName;
		}
		else if(lastName == null) {
			return "Hello Mr." + firstName;
		}
		return "Hello " + firstName + " " + lastName +" !";
	}
}
