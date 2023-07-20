package com.demo2.springboot.hospitalmanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.springboot.hospitalmanagement.dao.PatientDao;
import com.demo2.springboot.hospitalmanagement.model.Patient;
import com.demo2.springboot.hospitalmanagement.request.PatientRequest;

@Service
public class PatientService {

	
	@Autowired
	private PatientDao patientDao;
	
	public Patient createPatient(PatientRequest patientRequest) {
		
		Patient patient = new Patient();
		
		patient.setFirstName(patientRequest.getFirstName());
		patient.setLastName(patientRequest.getLastName());
		patient.setGender(patientRequest.getGender());
		patient.setDateOfBirth(patientRequest.getDateOfBirth());
		patient.setAddress(patientRequest.getAddress());
		patient.setContactNumber(patientRequest.getContactNumber());
		patient.setEmail(patientRequest.getEmail());
		patient.setMedicalHistory(patientRequest.getMedicalHistory());
		
		patient = patientDao.save(patient);
		
		return patient;
		
	}
	
}
