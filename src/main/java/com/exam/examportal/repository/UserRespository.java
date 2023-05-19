package com.exam.examportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.examportal.entities.Users;

public interface UserRespository extends JpaRepository<Users,Long> {

	public Users save(Users user);

	public Users findByUsername(String username);

}
