package com.microservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Whenever you use controller annotation it is important
 * to remember that the method should be annotated with t
 * -e response body annotation.
 * The rest controller annotation which suppress the need
 * of an extra annotation.
 * */
@Controller
@RequestMapping(path = "/greet")
public class HelloWorld {
	
	@GetMapping(path = "/hello")
	 public @ResponseBody String helloWorld() {
		return "hello world";
	}

}
