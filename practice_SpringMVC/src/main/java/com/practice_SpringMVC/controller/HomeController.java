package com.practice_SpringMVC.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HomeController{

	@RequestMapping("/index")
	public String index()  {
		
		//return "hello00";
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
