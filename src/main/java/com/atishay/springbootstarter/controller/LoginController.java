package com.atishay.springbootstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "index";
	}

	@GetMapping("/access-denied")
	public String accessDenied() {
		return "access-denied";
	}
}
