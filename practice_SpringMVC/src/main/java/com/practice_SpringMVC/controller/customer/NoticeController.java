package com.practice_SpringMVC.controller.customer;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice_SpringMVC.entity.Notice;
import com.practice_SpringMVC.service.NoticeService;


@Controller//객체화
public class NoticeController {
	
	
	//setter을 autowired로 하면 메소드 안에 실행문이 있다면 실행 가능
	@Autowired
	private NoticeService noticeService;

	

	@RequestMapping("/customer/notice/list")
	public String list(Model model) throws ClassNotFoundException, SQLException {
	List<Notice> list = noticeService.getList(1, "TITLE","");
	model.addAttribute("list", list);
	
		return "notice.list";
		
	}
	
	@RequestMapping("/customer/notice/detail")
	public String detail() {
		return "notice.detail";
		
	}
}
