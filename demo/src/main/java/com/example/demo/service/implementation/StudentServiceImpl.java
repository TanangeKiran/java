package com.example.demo.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service

public class StudentServiceImpl implements StudentService {
	
	
	StudentRepository studentRepository;
	


	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student) ;
	}



	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}



	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}



	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
			
		return studentRepository.findAll();
	}



	@Override
	public Student updateStudent(Student student, int id) {
		// TODO Auto-generated method stub
		Student stu=studentRepository.findById(id).get();
		stu.setName(student.getName());
	    stu.setAge(student.getAge());
		return studentRepository.save(stu);
	}
	
	

}
