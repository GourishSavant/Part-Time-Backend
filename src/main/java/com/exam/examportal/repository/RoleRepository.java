package com.exam.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.entities.Role;
import com.exam.examportal.entities.UserRole;

public interface RoleRepository  extends JpaRepository< Role, Long >{

	
  
}
