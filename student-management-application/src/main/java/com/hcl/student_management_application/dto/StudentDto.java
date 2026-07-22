package com.hcl.student_management_application.dto;

import java.time.LocalDate;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDto {

	@NotNull(message = "Roll number is required")
    @Positive(message = "Roll number must be greater than 0")
    private Integer rollNo;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name should contain only alphabets")
    private String name;

    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    private LocalDate dob;

    @NotBlank(message = "Father name is required")
    @Size(min = 2, max = 20, message = "Father name must be between 2 and 20 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Father name should contain only alphabets")
    private String fatherName;

    @NotBlank(message = "Contact number is required")
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Enter a valid 10-digit mobile number")
    private String contactNo;

    @NotBlank(message = "WhatsApp number is required")
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Enter a valid 10-digit WhatsApp number")
    private String whatsAppNo;

    @NotBlank(message = "Official email is required")
    @Email(message = "Enter a valid email address")
    private String gmailIdOfficial;

    @NotBlank(message = "Highest qualification is required")
    @Size(max = 20)
    private String highestQualification;

    @NotNull(message = "Admission date is required")
    private LocalDate dateOfAdmission;

    @NotNull(message = "Batch start date is required")
    private LocalDate batchStartDate;

    @NotNull(message = "Batch end date is required")
    private LocalDate batchEndDate;

    @NotBlank(message = "Completed module is required")
    @Size(max = 100)
    private String completedModule;

    @NotBlank(message = "College name is required")
    @Size(min = 3, max = 100)
    private String collegeName;

    @NotBlank(message = "Course name is required")
    @Size(min = 2, max = 50)
    private String courseName;

    @NotBlank(message = "Course duration is required")
    private String courseDuration;

    @DecimalMin(value = "0.0", inclusive = false, message = "Base price must be greater than 0")
    private double basePrice;

    @DecimalMin(value = "0.0", inclusive = false, message = "Offer price must be greater than 0")
    private double offerPrice;

    @PositiveOrZero(message = "Paid amount cannot be negative")
    private double paid;

    @PositiveOrZero(message = "Pending amount cannot be negative")
    private double pending;

    @NotBlank(message = "Please specify how you know about us")
    @Size(max = 100)
    private String howDidYouKnowAboutUs;

    @Size(max = 5000, message = "Note cannot exceed 5000 characters")
    private String note;
}
