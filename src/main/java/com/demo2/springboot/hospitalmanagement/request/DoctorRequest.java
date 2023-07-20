package com.demo2.springboot.hospitalmanagement.request;
import java.time.LocalDate;


import lombok.Data;


@Data
public class DoctorRequest {
	

	 private String firstName;
	 private String lastName;
	 private String gender;
	 private LocalDate dateOfBirth;
	 private String address;
	 private String contactNumber;
	 private String email;
	 private String specialization;
}




 
