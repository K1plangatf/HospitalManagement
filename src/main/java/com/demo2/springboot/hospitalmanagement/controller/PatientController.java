package com.demo2.springboot.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.springboot.hospitalmanagement.model.Patient;
import com.demo2.springboot.hospitalmanagement.request.PatientRequest;
import com.demo2.springboot.hospitalmanagement.service.PatientService;

@RestController
@RequestMapping(value = "/hm/v1/patient")
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping(value="/save")
	public ResponseEntity<?> savePatient(@RequestBody PatientRequest patientRequest) {
		
		Patient patient =patientService.createPatient(patientRequest);
		return ResponseEntity.ok().body(patient);
	}

}
