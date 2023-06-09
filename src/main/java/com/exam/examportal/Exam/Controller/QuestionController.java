package com.exam.examportal.Exam.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examportal.Exam.Question;
import com.exam.examportal.Exam.Quiz;
import com.exam.examportal.Exam.Service.QuestionService;
import com.exam.examportal.Exam.Service.QuizService;

import io.jsonwebtoken.lang.Collections;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionservice;
	
	
	@Autowired
	private QuizService quizService;
	
	//add Question
	@PostMapping("/")
	public ResponseEntity<Question > add(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.questionservice.addQuestion(question));
	}
	//update
	@PutMapping("/")
	public ResponseEntity<Question> update(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.questionservice.updateQuestion(question));
	}
	
	//get all question of any quiz 
	@GetMapping("/quiz/{qid}")
	public ResponseEntity<?> getQuestionOfQuiz(@PathVariable("qid") Long qid)
	{
//		Quiz  quiz= new Quiz();
//		quiz.setqId(qid);
//		Set<Question> questionofQuiz = this.service.getQuestionofQuiz(quiz);
//		return ResponseEntity.ok(questionofQuiz);
		Quiz quiz = this.quizService.getQuiz(qid);
		Set<Question> questions = quiz.getQuestions();
		List<Question> list = new ArrayList<>(questions);
		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestions()))
		{
			list= list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions()+1));
		}
//		Collections.shuffle(list);
		return ResponseEntity.ok(list);
	}
	
	//get single question
	@GetMapping("/{quesId}")
	
	public  Question get(@PathVariable("quesId") Long quesId) {
		return this.questionservice.getQuestion(quesId);
	}
	//delete 
	@DeleteMapping("/{quesId}")
	public void delete(@PathVariable("quesId") Long quesId)
	{
		this.questionservice.deleteQuestion(quesId);
	}
	
}
