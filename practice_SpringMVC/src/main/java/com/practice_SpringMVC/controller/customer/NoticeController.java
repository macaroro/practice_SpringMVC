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


@Controller//��üȭ
public class NoticeController {
	
	
	//setter�� autowired�� �ϸ� �޼ҵ� �ȿ� ���๮�� �ִٸ� ���� ����
	@Autowired
	private NoticeService noticeService;

	

	@RequestMapping("/customer/notice/list")
	//@RequestParam("p")�� url���� �޾ƿ��� ?p�� ��Ʈ�ѷ������� page�� �ްٴ�(�⺻�� ��������)
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
