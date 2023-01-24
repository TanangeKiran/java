package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService  {
	
	Student createStudent(Student student);
	
	void deleteStudentById(int id);
	
	Student  getStudentById(int id);
	
	List<Student> getAllStudent();
	
	Student updateStudent(Student student,int id);
	

	
	
	
}
