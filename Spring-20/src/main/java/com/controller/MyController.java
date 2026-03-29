package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admission")
public class MyController {

	@GetMapping("/registration.do")
	// @RequestMapping(value = "/registration.do", method = RequestMethod.GET )
	public String register() {

		System.out.println("TEST..........");
		return "registration";
	}

}
