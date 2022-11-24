package com.practice_SpringMVC.controller.customer;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice_SpringMVC.entity.Notice;
import com.practice_SpringMVC.service.NoticeService;


@Controller//객체화
public class NoticeController {
	
	
	//setter을 autowired로 하면 메소드 안에 실행문이 있다면 실행 가능
	@Autowired
	private NoticeService noticeService;

	

	@RequestMapping("/customer/notice/list")
	//@RequestParam("p")눈 url에서 받아오는 ?p를 컨트롤러에서는 page로 받겟다(기본값 지정가능)
	public String list(@RequestParam(value="p", defaultValue = "1") String page) throws ClassNotFoundException, SQLException {
	//List<Notice> list = noticeService.getList(1, "TITLE","");
	//model.addAttribute("list", list);
	
		System.out.println("page:"+ page);
		return "notice.list";
		
	}
	
	@RequestMapping("/customer/notice/detail")
	public String detail() {
		return "notice.detail";
		
	}
}
