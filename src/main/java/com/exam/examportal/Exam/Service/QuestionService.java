package com.exam.examportal.Exam.Service;

import com.exam.examportal.Exam.Question;
import com.exam.examportal.Exam.Quiz;
import java.util.*;

public interface QuestionService {
 
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestion();
	
	public Question getQuestion(Long questionId);
	
	public Set<Question> getQuestionofQuiz(Quiz quiz);
	
	public  void deleteQuestion(Long quesId);
	
}
