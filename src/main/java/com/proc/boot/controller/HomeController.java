package com.proc.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping(value = "/test", produces="text/plain")
	public String Home(HttpServletRequest req, HttpServletResponse res) {
		return "Hi ,Welcome to HOme";
	}
}