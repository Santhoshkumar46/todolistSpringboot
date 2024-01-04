package com.springboot.todolist.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHello {
	
	@RequestMapping("sayHello")
	@ResponseBody
	public String sayHello() {
		return "Hey! whats up?";
	}

	@RequestMapping("sayHelloJsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
