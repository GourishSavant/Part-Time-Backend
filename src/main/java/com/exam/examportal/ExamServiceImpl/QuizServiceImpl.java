package com.exam.examportal.ExamServiceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examportal.Exam.Quiz;
import com.exam.examportal.Exam.Service.QuizService;
import com.exam.examportal.Exam.repo.QuizRespository;
import java.util.*;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRespository quizrespository;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizrespository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizrespository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.quizrespository.findAll());
	}

	@Override
	public Quiz getQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return this.quizrespository.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setqId(quizId);
		
		this.quizrespository.delete(quiz);
		
	}

}
