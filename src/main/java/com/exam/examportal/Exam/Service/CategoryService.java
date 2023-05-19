package com.exam.examportal.Exam.Service;

import java.util.Set;

import com.exam.examportal.Exam.Category;

public interface CategoryService {

	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public Set<Category> getCatgories();
	public Category getCategory(Long categoryId);
	public void deleteCategory(Long categoryId);
	
}
