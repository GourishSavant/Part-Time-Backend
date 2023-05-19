package com.exam.examportal.Exam.Service;

import com.exam.examportal.Exam.Quiz;
import java.util.*;

public interface QuizService {
public Quiz addQuiz(Quiz quiz);

public Quiz updateQuiz(Quiz quiz);

public Set<Quiz> getQuizzes();

public Quiz getQuiz(Long quizId);

public void deleteQuiz(Long quizId);


	
}
