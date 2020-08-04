package com.mani.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

	@GetMapping("/test/helloworld")
	public String getHelloWorld() {
		System.out.println("Called test controller");
		return "Hello worid";
	}
	
}
