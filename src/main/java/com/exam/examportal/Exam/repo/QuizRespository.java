package com.exam.examportal.Exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.Exam.Quiz;

public interface QuizRespository extends JpaRepository<Quiz, Long>{

}
