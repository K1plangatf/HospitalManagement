package com.demo2.springboot.hospitalmanagement.request;


import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AppointmentRequest {

	
	 private Long patientId;
	 private Long doctorId;
	 private LocalDateTime  appointmentDate;
	 private String symptoms;
	 private String diagnosis;
	 private String prescription;
}
