package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping 클래스(타입) + 핸들러메소드
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/join", method=RequestMethod.GET) // join url로들어오는 get방식만 받음
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value = "/join", method=RequestMethod.POST) 
	public String join(UserVo vo) {
		System.out.println(vo);
//		userDao.insert(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update() {
		return "UserController.update()";
	}
}
