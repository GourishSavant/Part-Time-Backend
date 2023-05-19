package com.exam.examportal.Exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.Exam.Category;

public interface CategoryRespository extends JpaRepository<Category,Long >{

	
}
