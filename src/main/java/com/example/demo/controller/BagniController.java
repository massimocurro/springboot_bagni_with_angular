package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BagniController {
	@RequestMapping("/")
	public String Index() {
		return "index";
	}

	@RequestMapping("/admin")
	public String Admin() {
		return "admin";
	}

}
