package com.test.swagger.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.swagger.dao.IStudentDao;
import com.test.swagger.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao{
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<Student> queryAll() {
		return session.selectList("queryAll");
	}

	@Override
	public void deleteStudentById(Integer id) throws Exception{
		session.delete("deleteStudentById", id);
		//	
		/*session.selectOne("StudentMapper.deleteStudentById","canshu");*/
	}

	@Override
	public void updateStudentById(Student student) {
		session.update("updateStudentById", student);
	}

	@Override
	public void addStudent(Student student) {
		session.insert("addStudent", student);
	}

	@Override
	public Student queryStudentById(Integer id) {
		return session.selectOne("queryStudentById", id);
	}

}
