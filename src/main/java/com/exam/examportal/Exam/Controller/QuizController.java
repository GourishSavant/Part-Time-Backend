package com.exam.examportal.Exam.Controller;

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

//import com.exam.examportal.Exam.Category;
import com.exam.examportal.Exam.Quiz;
import com.exam.examportal.Exam.Service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	//add quiz service
	@PostMapping("/")
	public ResponseEntity<Quiz> addCategory(@RequestBody Quiz quiz)
	{
		this.quizService.addQuiz(quiz);
		return ResponseEntity.ok(quiz);	
	}
	//update quiz
	@PutMapping("/")
	public ResponseEntity<Quiz>update(@RequestBody Quiz quiz)
	{
    	return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
		
	}
	//get quiz 
	@GetMapping("/")
	public ResponseEntity<?> quizzes()
	{
		return ResponseEntity.ok(this.quizService.getQuizzes());
	}
	
	
	//get single quiz
	@GetMapping("/{qid}")
	public Quiz quiz(@PathVariable("qid")Long qid)
	{
		return this.quizService.getQuiz(qid);
	}
	//delete 
	@DeleteMapping("/{qid}")
	public void delete(@PathVariable("qid") Long qid) {
		 this.quizService.deleteQuiz(qid);
	}
	
	
}
