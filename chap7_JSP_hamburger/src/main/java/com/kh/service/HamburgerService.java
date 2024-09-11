package com.kh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.entity.Hamburger;
import com.kh.repository.HamburgerReposeitory;

@Service
public class HamburgerService {

	@Autowired
	private HamburgerReposeitory hamburgerReposeitory;
	
	public List<Hamburger> getHamburger() {
		return hamburgerReposeitory.findAll();
	}
	
	public void addHamburger(Hamburger hamburger) {
		hamburgerReposeitory.save(hamburger);
	}
}
