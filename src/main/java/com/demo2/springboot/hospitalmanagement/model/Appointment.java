package com.demo2.springboot.hospitalmanagement.model;

//import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="MD_Appointment")
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

	@Id
	@Column(name="appointmentId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentId;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="patientId", nullable=false)
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="doctorId", nullable=false)
	private Doctor doctor;
	
	@Column(name="appointmentDate", nullable=false)
	private LocalDateTime  appointmentDate;
	   
	@Column(name="symptoms")
	 private String symptoms;
	
	@Column(name="diagnosis")
	 private String diagnosis;
	
	@Column(name="prescription")
	 private String prescription;
	
	
}
