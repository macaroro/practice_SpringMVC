package com.practice_SpringMVC.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice_SpringMVC.entity.Notice;
import com.practice_SpringMVC.service.NoticeService;

@RestController("apiNoticeController")//restful�� ��ȯ �̸��� ���� ����
@RequestMapping("/api/notice/")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
	List<Notice> list = noticeService.getList(1, "title","");
	
	
		return list;
		
	}
	//NoticeCollner�� ��äȭ �ϸ鼭 ex)NoticeController = noticeController = new NoticeController
	//<bean id="noticeContoller" class="....NoticeController">
	//�׷��� ���� ���� �̸��� �ִ� �� ���� �浹
	}
