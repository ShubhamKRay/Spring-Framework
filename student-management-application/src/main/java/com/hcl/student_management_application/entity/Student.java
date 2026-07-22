package com.hcl.student_management_application.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "studentmanagement")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Integer rollNo;

	@Column(length = 20)
	private String name;

	private LocalDate dob;

	@Column(length = 20)
	private String fatherName;

	@Column(length = 15)
	private String contactNo;

	@Column(length = 15)
	private String whatsAppNo;

	@Column(length = 50)
	private String gmailIdOfficial;

	@Column(length = 20)
	private String highestQualification;

	private LocalDate dateOfAdmission;

	private LocalDate batchStartDate;

	private LocalDate batchEndDate;

	private String completedModule;

	@Column(length = 100)
	private String collegeName;

	@Column(length = 50)
	private String courseName;

	private String courseDuration;

	private double basePrice;

	private double offerPrice;

	private double paid;

	private double pending;

	@Column(length = 100)
	private String howDidYouKnowAboutUs;

	@Column(length = 5000)
	private String note;
}
