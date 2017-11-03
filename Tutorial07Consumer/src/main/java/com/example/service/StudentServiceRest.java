package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.dao.CourseDAO;
import com.example.dao.StudentDAO;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import groovy.util.logging.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public StudentModel selectStudent(String npm) {
		return studentDAO.selectStudent (npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentDAO.selectAllStudents();
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub

	}

	@Override
	public CourseModel selectAllStudentsCourse(String idCourse) {
		// TODO Auto-generated method stub
		return courseDAO.selectCourse(idCourse);
	}

	@Override
	public List<CourseModel> selectAllCourse() {
		// TODO Auto-generated method stub
		return courseDAO.selectAllCourse();
	}

}
