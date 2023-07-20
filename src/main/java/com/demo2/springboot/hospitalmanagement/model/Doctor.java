package com.demo2.springboot.hospitalmanagement.model;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name="MD_Doctor")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	   @Id
	   @Column(name="doctorId", nullable=false)
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long doctorId;
	   
	   @Column(name="firstName", nullable=false)
	    private String firstName;
	   
	   @Column(name="lastName", nullable=false)
	    private String lastName;
	   
	   @Column(name="gender", nullable=false)
	    private String gender;
	   
	   @Column(name="dateOfBirth", nullable=false)
	    private LocalDate dateOfBirth;
	   
	   @Column(name="address", nullable=false)
	    private String address;
	   
	   @Column(name="contactNumber", nullable=false)
	    private String contactNumber;
	   
	   @Column(name="email", nullable=false, unique = true)
	    private String email;
	   
	   @Column(name="specialization")
	    private String specialization;
	
}
