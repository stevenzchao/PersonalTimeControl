package com.example.demo.basic1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Basic1Controller {
	
	@GetMapping(value="WorkinaWeek")
	public String workInAWeek() {
		return "basic1/workinaweek";
	}

}
