package com.kh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.entity.Hamburger;
import com.kh.service.HamburgerService;

@Controller
public class HamburgerController {

	@Autowired
	private HamburgerService hamburgerService;
	
	@GetMapping("/hamburgerlist")
	public String getHamburgerList(Model model) {
		List<Hamburger> hamburgers = hamburgerService.getHamburger();
		model.addAttribute("hamburgers", hamburgers);
		return "hamburgerList";
	}
	
	@PostMapping("/addHamburger")
	public String addHamburger(Hamburger hamburger) {
		hamburgerService.addHamburger(hamburger);
		return "redirect:/hamburgerlist"; // redirect 다시 불러올 api주소를 작성 
	}
}
