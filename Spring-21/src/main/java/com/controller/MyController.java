package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admission")
public class MyController {

	@GetMapping("/registration.do")
	public String registerView() {

		return "registration";
	}

//	@PostMapping("/registration.do")
//	public String register(HttpServletRequest request) {
//
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String address = request.getParameter("address");
//		String salary = request.getParameter("salary");
//
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(address);
//		System.out.println(salary);
//
//		return "registration";
//	}

//	@PostMapping("/registration.do")
//	public String register(@ModelAttribute Employee employee) {
//
//		System.out.println(employee);
//
//		return "redirect:/admission/registration.do";
//	}

	@GetMapping("delete.do")
	public String register(@RequestParam("id") int id, @RequestParam("name") String name) {

		System.out.println(id);
		System.out.println(name);

		return "redirect:/admission/registration.do";
	}

}
