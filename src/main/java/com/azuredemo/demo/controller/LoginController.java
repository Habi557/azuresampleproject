package com.azuredemo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {
	@GetMapping("/")
	public String login() {
		
		
		return "Home";
	}
	

}
