package com.demo2.springboot.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.springboot.hospitalmanagement.model.Doctor;
import com.demo2.springboot.hospitalmanagement.request.DoctorRequest;
import com.demo2.springboot.hospitalmanagement.service.DoctorService;

@RestController
@RequestMapping(value = "/hm/v1/doctor")
public class DoctorController {
	
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping(value="/save")
	public ResponseEntity<?> saveDoctor(@RequestBody DoctorRequest doctorRequest) {
		
		Doctor doctor =doctorService.createDoctor(doctorRequest); 
		return ResponseEntity.ok().body(doctor);
	}

}
