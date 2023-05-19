package com.exam.examportal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.examportal.entities.Role;
import com.exam.examportal.entities.UserRole;
import com.exam.examportal.entities.Users;
import com.exam.examportal.service.UserService;
import java.util.*;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	@Autowired
	private  BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("starting code");
		
//		Users user = new Users();
//		
//		user.setFirstname("Durga");
//		user.setLastname("Dope");
//		user.setUsername("GSnt");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
////		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("default");
////		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ABCd");
////		
//		Set<UserRole> userRoleSet =new HashSet<>();
//		UserRole userRole =new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		Users user1 =this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}
}
