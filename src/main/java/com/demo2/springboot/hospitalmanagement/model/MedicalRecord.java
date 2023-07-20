package com.demo2.springboot.hospitalmanagement.model;


import java.time.LocalDate;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="MD_MedicalRecord")
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {

	@Id
	@Column(name="medicalRecordId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long medicalRecordId;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="patientId", nullable=false)
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="doctorId", nullable=false)
	private Doctor doctor;
	
	@Column(name="date", nullable=false)
	private LocalDate date;
	   
	@Column(name="notes")
	 private String notes;
	
}
