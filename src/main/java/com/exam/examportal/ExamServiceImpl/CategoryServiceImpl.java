package com.exam.examportal.ExamServiceImpl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examportal.Exam.Category;
import com.exam.examportal.Exam.Service.CategoryService;
import com.exam.examportal.Exam.repo.CategoryRespository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRespository categoryRespository;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryRespository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryRespository.save(category);
	}

	@Override
	public Set<Category> getCatgories() {
		// TODO Auto-generated method stub
	return new LinkedHashSet<>(this.categoryRespository.findAll());
	}

	@Override
	public Category getCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return this.categoryRespository.findById(categoryId).get();
	}

	@Override
	public void deleteCategory(Long categoryId) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.setCid(categoryId);
		this.categoryRespository.delete(category);
		
	}

	
}
