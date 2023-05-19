package com.exam.examportal.service;
import java.util.*;



import com.exam.examportal.entities.UserRole;
import com.exam.examportal.entities.Users;

public interface UserService {
//creating user
	public Users createUser(Users user, Set<UserRole> userRoles) throws Exception;
	
//	get user by username
	public Users getUser(String username);
	
	//delete user by Id 
	public void deleteUser(Long userId);
}


