package com.mulcam.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllerImpl implements WebController {

	
	@Override
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@Override
	@GetMapping("/demo")
	public String demo() {
		return "demo";
	}
	


	
	
} //class
