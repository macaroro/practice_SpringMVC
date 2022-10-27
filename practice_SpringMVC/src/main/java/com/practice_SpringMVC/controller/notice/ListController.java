package com.practice_SpringMVC.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.practice_SpringMVC.entity.Notice;
import com.practice_SpringMVC.service.NoticeService;

public class ListController implements Controller{
	//noticeSercvice의 인터페이스를 상속
	
	private NoticeService noticeService;

	public void setNoticeService(NoticeService noticeService) {//서블릿의 property의 name
		this.noticeService = noticeService;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		
		ModelAndView mv = new ModelAndView("notice.list");
		List<Notice> list = noticeService.getList(1, "TITLE","");
		mv.addObject("list",list);
	
		return mv;
	}

}
