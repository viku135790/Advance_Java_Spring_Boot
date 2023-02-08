package com.qspider.spring_boot_first_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProjectController {
	@GetMapping("ownName")
	public String getData() {
		return "This is first project";
	}

}
