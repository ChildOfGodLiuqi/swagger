package com.test.swagger.dao;

import java.util.List;

import com.test.swagger.model.Student;

public interface IStudentDao {
	
	List<Student> queryAll();
	
	Student queryStudentById(Integer id);
	
	void deleteStudentById(Integer id) throws Exception;
	
	void updateStudentById(Student student);
	
	void addStudent(Student student);
}
