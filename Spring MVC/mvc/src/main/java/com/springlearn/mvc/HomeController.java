package com.springlearn.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getIndex() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		if(name != null) {
			name = "Yo! " + name.toUpperCase() + ", wassup................!";
			model.addAttribute("message", name);
		}
		return "helloworld";
	}
	
	@RequestMapping("/processForms")
	public String processForm(@RequestParam("studentName") String name, Model model) {
//		String name = request.getParameter("studentName");
		if(name != null) {
			name = "Yo! " + name.toUpperCase() + ", wassup................!";
			model.addAttribute("message", name);
		}
		return "helloworld";
	}
}
