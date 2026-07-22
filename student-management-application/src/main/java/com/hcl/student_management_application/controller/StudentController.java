package com.hcl.student_management_application.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.student_management_application.entity.Student;
import com.hcl.student_management_application.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/addStudent")
	public ResponseEntity<?> addStudentController(@Valid @RequestBody Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			HashMap<String, String> hashMap = new HashMap<String, String>();

			for (FieldError fieldError : bindingResult.getFieldErrors()) {

				hashMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}

			return new ResponseEntity<>(hashMap, HttpStatus.BAD_REQUEST);
		}

		else {
			Student student2 = studentService.addStudentService(student);

			System.out.println(student2);
			return new ResponseEntity<>(student2, HttpStatus.CREATED);
		}

	}
}
