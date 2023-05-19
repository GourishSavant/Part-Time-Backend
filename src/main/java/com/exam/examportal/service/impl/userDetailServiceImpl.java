package com.exam.examportal.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exam.examportal.entities.Users;
import com.exam.examportal.repository.UserRespository;

@Service
public class userDetailServiceImpl implements UserDetailsService {

	@Autowired
	private  UserRespository userRespository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user=  this.userRespository.findByUsername(username);
		if(user == null) {
			
			System.out.println("User not found");
			throw new UsernameNotFoundException("No user found !!");
		}
		
		return user;
	}
 
}
