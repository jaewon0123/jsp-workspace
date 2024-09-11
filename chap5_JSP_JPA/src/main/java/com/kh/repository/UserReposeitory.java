package com.kh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.entity.JSPUser;

public interface UserReposeitory extends JpaRepository<JSPUser, Integer> {

}
