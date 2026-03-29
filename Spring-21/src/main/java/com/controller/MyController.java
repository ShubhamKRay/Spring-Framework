package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.Employee;

@Controller
@RequestMapping("/admission")
public class MyController {

//	@GetMapping("/registration.do")
//	public String registerView() {
//
//		return "registration";
//	}

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

//	====================================
//	@GetMapping("delete.do")
//	public String register(@RequestParam("id") int id, @RequestParam("name") String name) {
//
//		System.out.println(id);
//		System.out.println(name);
//
//		return "redirect:/admission/registration.do";
//	}

	
	
	
//------------------------------------------------------------------------------------------	
	
    @GetMapping("registration")
	public String registerView(Model model) {
		if(!model.containsAttribute("message")) {
		   model.addAttribute("message","this is my registration page");
		}
		return "registration";
	}
	
	@PostMapping("registration")
	public String register( @ModelAttribute Employee employee, RedirectAttributes redirectAttributes ) {
		
		System.out.println(employee);
		redirectAttributes.addFlashAttribute("message","data inserted");
		return "redirect:/dynamic/admission/registration";
	}
	
	@GetMapping("delete")
	public String delete( @RequestParam("id") int id, @RequestParam("name") String name) {
		
		System.out.println(id);
		System.out.println(name);
		return "redirect:/index.html";  
	}
	
	@GetMapping("deletebyid/{id}")  //dispatcherServlet URL= do not use .
	public String delete(@PathVariable int id) {
		System.out.println(id);
		return "redirect:/index.html";  
	}

	
}
