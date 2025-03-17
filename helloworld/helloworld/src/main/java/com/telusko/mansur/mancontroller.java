package com.telusko.mansur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mancontroller {
	
	
	@RequestMapping("/hi")
	public String greet()
	{
		return "hello world";
	}

}
