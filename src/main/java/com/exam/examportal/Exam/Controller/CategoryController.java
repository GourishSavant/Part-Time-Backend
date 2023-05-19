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

import com.exam.examportal.Exam.Category;
import com.exam.examportal.Exam.Service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
	
	
	@Autowired
	private CategoryService categoryservice;
	
	//add Category
	@PostMapping("/")
	public ResponseEntity<Category> addCategory(@RequestBody Category category)
	{
		this.categoryservice.addCategory(category);
		return ResponseEntity.ok(category);	
	}
	//get Category
	@GetMapping("/{categoryId}")
	
		public Category getCategory(@PathVariable("categoryId")Long categoryId)
		{
			return this.categoryservice.getCategory(categoryId);
		}
	
	//get All Categories
	@GetMapping("/")
	public ResponseEntity<?> getCategories(){
		return ResponseEntity.ok(this.categoryservice.getCatgories());
	}
	
	//update
	@PutMapping("/")
	public Category updateCategory(@RequestBody Category category)
	{
		return this.categoryservice.updateCategory(category);
		
	}
	
	//delete Category
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable("categoryId")Long categoryId)
	{
		this.categoryservice.deleteCategory(categoryId);
		
	}
	
	

}
