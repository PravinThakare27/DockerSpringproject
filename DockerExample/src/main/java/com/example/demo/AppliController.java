package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppliController {
	@GetMapping("/name/{name}")
	public String welcomemsg(@PathVariable("name") String name) {
		return name+" Welcome";
	}
}
