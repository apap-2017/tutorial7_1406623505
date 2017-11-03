package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.model.StudentModel;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {

	@Autowired
	StudentService studentService;
	@RequestMapping("/course/view/{idCourse}")
	public CourseModel view (@PathVariable(value = "idCourse") String idCourse) 
	{
		CourseModel course = studentService.selectAllStudentsCourse(idCourse);
		return course;
	}
	
	@RequestMapping("/course/viewall")
	public List <CourseModel> viewall () 
	{
		List <CourseModel> course = studentService.selectAllCourse();
		return course;
	}
	
}
