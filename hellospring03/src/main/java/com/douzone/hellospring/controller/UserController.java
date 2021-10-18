package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String update(@RequestParam("n") String name) {
		/*
		 * 만일 n이라는 이름의 파라미터가 없는 경우
		 * 400 bad request 에러 발생
		 */
		System.out.println(name);
		return "UserController.update()";
	}
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required=true, defaultValue="") String name, 	//꼭 들어가야하는데 비어있으면 디폴트값으로 "" 넣음
						  @RequestParam(value="a", required=true, defaultValue="0") Integer age) {
		System.out.println("------"+name+"-------");
		System.out.println("------"+age+"-------");
		return "UserController.update()";
	}
}
