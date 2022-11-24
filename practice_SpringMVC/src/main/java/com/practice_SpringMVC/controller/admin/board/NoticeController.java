package com.practice_SpringMVC.controller.admin.board;
//보드를 관리하는 패키지

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list() {//목록
		return "";
		
	}
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title,String content,String category) {//등록
		return String.format("title:%s<br>content:%s<br>content:%s<br>", title,content,category);
		
	}
	
	@RequestMapping("edit")
	public String edit() {//수정
		return "";
		
	}
	@RequestMapping("del")
	public String del() {//삭제
		return "";
		
	}
}
