package com.practice_SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController{

	@RequestMapping("/index")
	public String index() {

		return "root.index";
	}
	
	@RequestMapping("/help")
	public void help() {

		
	}
	
	
	
	
	
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println(">>>>");
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data","µÇ³ª¿ä");
//	
//		return mv;
//	}
	

}
