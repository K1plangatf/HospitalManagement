package com.demo2.springboot.hospitalmanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.springboot.hospitalmanagement.dao.DoctorDao;
import com.demo2.springboot.hospitalmanagement.model.Doctor;
import com.demo2.springboot.hospitalmanagement.request.DoctorRequest;

@Service
public class DoctorService {

	
	@Autowired
	private DoctorDao doctorDao;
	
	public Doctor createDoctor(DoctorRequest doctorRequest) {
		
		Doctor doctor = new Doctor();
		
		doctor.setFirstName(doctorRequest.getFirstName());
		doctor.setLastName(doctorRequest.getLastName());
		doctor.setGender(doctorRequest.getGender());
		doctor.setDateOfBirth(doctorRequest.getDateOfBirth());
		doctor.setAddress(doctorRequest.getAddress());
		doctor.setContactNumber(doctorRequest.getContactNumber());
		doctor.setEmail(doctorRequest.getEmail());
		doctor.setSpecialization(doctorRequest.getSpecialization());
		
		doctor = doctorDao.save(doctor);
		
		return doctor;
		
	}
	
}

