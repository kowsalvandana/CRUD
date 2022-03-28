package com.sree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.UserDetails;
import com.sree.repo.UserDetailsRepo;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDetailsRepo repo;

	@Override
	public Integer saveUserDetails(UserDetails ud) {
		
		return repo.save(ud).getId();
	}

}
