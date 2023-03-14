package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    @Size(min = 2, message = "FIRST NAME MUST CONTAIN ATLE-AST 2 CHARACTER")
    private String empFirstName;

    @Pattern(regexp = "[A-Za-z]*", message = "Last name should not contain space and special characters")
    private String empLastName;

    private String empAddress;

    @Size(min = 10, max = 10, message = "CONTACT NUMBER MUST BE VALID")
    @Column(unique = true)
    private String empContactNumber;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
    private Date empDOB;

    @Email(message = "EMAIL ID MUST BE VALID")
    private String empEmailId;

    @Size(min = 4, message = "PASS SHOULD CONTAIN AT LEAST 4 CHARACTER")
    private String empPassword;
}
