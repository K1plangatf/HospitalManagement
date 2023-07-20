

package com.demo2.springboot.hospitalmanagement.request;

import java.time.LocalDate;

import lombok.Data;


@Data
public class MedicalRecordRequest {
	

	private Long patientId;
	private Long doctorId;
	private LocalDate date;
	private String notes;
}






