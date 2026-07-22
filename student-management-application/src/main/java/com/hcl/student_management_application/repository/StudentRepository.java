package com.hcl.student_management_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.student_management_application.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
