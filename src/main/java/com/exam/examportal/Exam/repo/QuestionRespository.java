package com.exam.examportal.Exam.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.Exam.Question;
import com.exam.examportal.Exam.Quiz;

public interface QuestionRespository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);

	
}
