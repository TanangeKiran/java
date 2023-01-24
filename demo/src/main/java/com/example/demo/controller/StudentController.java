package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/api")

public class StudentController {
	StudentService studentService;
	
	 
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	@PostMapping("/stu")
	private Student createStudent(@RequestBody Student student) {
		Student stu =	studentService.createStudent(student);
		return stu;
	
		
	}
	@DeleteMapping("/stu/{id}")
	private void deleteStudentById(@PathVariable("id")int id) {
		studentService.deleteStudentById(id);
	}
	@GetMapping("/stu/{id}")
	private Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
		
	}
	@GetMapping("/stu")
	private List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	@PutMapping("/kir/{id}")
	private ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student){
		Student stu = studentService.updateStudent(student, id);
		
		
      
		 
		 return ResponseEntity.ok().body(stu);
		 
		
	
	}
	}
