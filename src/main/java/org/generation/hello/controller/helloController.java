package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/helloworld")


public class helloController {
	@GetMapping
	public String hello() {
	return "Hello World! sejam, bem vindos ao Spring";
	}

	
}
