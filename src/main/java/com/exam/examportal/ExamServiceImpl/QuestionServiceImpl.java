package com.exam.examportal.ExamServiceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examportal.Exam.Question;
import com.exam.examportal.Exam.Quiz;
import com.exam.examportal.Exam.Service.QuestionService;
import com.exam.examportal.Exam.repo.QuestionRespository;
import java.util.*;

@Service
public class QuestionServiceImpl  implements QuestionService{

	@Autowired
	private QuestionRespository questionrespository;
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionrespository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionrespository.save(question);
	}

	@Override
	public Set<Question> getQuestion() {
		// TODO Auto-generated method stub
		return new HashSet<> (this.questionrespository.findAll());
	}

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return this.questionrespository.findById(questionId).get();
	}

	@Override
	public Set<Question> getQuestionofQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return  this.questionrespository.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(Long quesId) {
		// TODO Auto-generated method stub
		Question question = new Question();
		question.setQuesId(quesId);
		this.questionrespository.delete(question);
		
	}

}
