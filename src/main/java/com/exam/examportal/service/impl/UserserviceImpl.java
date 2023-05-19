package com.exam.examportal.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examportal.Exception.UserFoundException;
import com.exam.examportal.entities.UserRole;
import com.exam.examportal.entities.Users;
import com.exam.examportal.repository.RoleRepository;
import com.exam.examportal.repository.UserRespository;
import com.exam.examportal.service.UserService;

@Service
public class UserserviceImpl implements UserService {
	
	@Autowired
	private UserRespository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
//creating  User 
	@Override
	public Users createUser(Users user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		Users local =this.userRepository.findByUsername(user.getUsername());
		if(local!=null)
		{
//			System.out.println("User is already there !!");
			throw new Exception("user already present!!");
		}
		else {
			for(UserRole ur : userRoles)
			{
				roleRepository.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

//geting user by username
	@Override
	public Users getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}
//delete user 
	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
		
	}

}
