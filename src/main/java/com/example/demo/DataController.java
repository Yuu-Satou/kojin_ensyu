package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DataController {
	
	@GetMapping("/")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("../static/react/index");
		return mv;
	}
}
