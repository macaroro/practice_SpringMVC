package com.practice_SpringMVC.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("apiNoticeController")//restful�� ��ȯ �̸��� ���� ����
@RequestMapping("/api/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {
		return "��������";
	}
	//NoticeCollner�� ��äȭ �ϸ鼭 ex)NoticeController = noticeController = new NoticeController
	//<bean id="noticeContoller" class="....NoticeController">
	//�׷��� ���� ���� �̸��� �ִ� �� ���� �浹
	}
