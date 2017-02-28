package com.test.swagger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.swagger.dao.IStudentDao;
import com.test.swagger.model.Student;
import com.test.swagger.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public List<Student> queryAll() {
		
		return studentDao.queryAll();
	}

	@Override
	public void deleteStudentById(Integer id) throws Exception {
		studentDao.deleteStudentById(id);
	}

	@Override
	public void updateStudentById(Student student) {
		studentDao.updateStudentById(student);
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public Student queryStudentById(Integer id) {
		return studentDao.queryStudentById(id);
	}

}
