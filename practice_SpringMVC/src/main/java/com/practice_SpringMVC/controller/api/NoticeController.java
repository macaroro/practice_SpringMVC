package com.practice_SpringMVC.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("apiNoticeController")//restful을 반환 이름을 지정 가능
@RequestMapping("/api/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {
		return "공지사항";
	}
	//NoticeCollner를 객채화 하면서 ex)NoticeController = noticeController = new NoticeController
	//<bean id="noticeContoller" class="....NoticeController">
	//그러다 보니 같은 이름이 있는 것 끼리 충돌
	}
