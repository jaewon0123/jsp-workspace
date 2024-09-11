package com.kh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.entity.JSPUser;
import com.kh.repository.UserReposeitory;



@Service
public class UserService {

	@Autowired
	private UserReposeitory userReposeitory;
	
	// 유저 목록 가져오는 메서드
	public List<JSPUser> getAllUsers() {
		return userReposeitory.findAll();
	}
	// 유저 추가하는 메서드
	public void addUser(JSPUser user) {
		userReposeitory.save(user);
	}
}
