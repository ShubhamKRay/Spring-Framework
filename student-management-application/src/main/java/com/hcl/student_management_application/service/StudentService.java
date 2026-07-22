package com.hcl.student_management_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.student_management_application.entity.Student;
import com.hcl.student_management_application.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudentService(Student student) {
		return studentRepository.saveAndFlush(student);
	}
}
