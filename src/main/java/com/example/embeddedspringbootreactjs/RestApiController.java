package com.example.embeddedspringbootreactjs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class RestApiController {

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello";
	}
}
