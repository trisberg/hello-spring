package com.example.helloboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBootController {

	@Value("${app.message:Spring}")
	String message;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello " + message;
	}
}
