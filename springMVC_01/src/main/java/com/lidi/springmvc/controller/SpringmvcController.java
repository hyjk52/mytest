package com.lidi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringmvcController {
	
	
	@RequestMapping("hello.do")
	public ModelAndView hello(){
		
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("hello","世界杯");
		
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}
	
	
}
