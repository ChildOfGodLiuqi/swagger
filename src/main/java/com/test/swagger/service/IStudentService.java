package com.test.swagger.service;

import java.util.List;

import com.test.swagger.model.Student;

public interface IStudentService {
	
	List<Student> queryAll();
	
	Student queryStudentById(Integer id);
	
	void deleteStudentById(Integer id) throws Exception;
	
	void updateStudentById(Student student);
	
	void addStudent(Student student);
}
