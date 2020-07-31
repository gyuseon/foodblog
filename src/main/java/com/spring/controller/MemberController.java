package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/foodblog")
public class MemberController {
	
	@GetMapping("/login")
	public void loginForm() {
		log.info("�α��� �� ��û");
	}
	
	@GetMapping("/register")
	public void registerForm() {
		log.info("ȸ������ â �̵�");
	}

}
