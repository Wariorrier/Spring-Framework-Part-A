package com.springlearn.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Show student form
	@RequestMapping("/show")
	public String showForm(Model model) {
		
		model.addAttribute("student", new Student());
		
		return "student-form";
	}
	
	// Deal with data
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}
