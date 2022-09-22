package com.thyme.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutPage(Model model) {
		model.addAttribute("devName", "Isha Bansal");
		model.addAttribute("curDate", new Date().toLocaleString());
		return "about";
	}
}
