package com.demo2.springboot.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.springboot.hospitalmanagement.model.Appointment;
import com.demo2.springboot.hospitalmanagement.request.AppointmentRequest;
import com.demo2.springboot.hospitalmanagement.service.AppointmentService;

@RestController
@RequestMapping(value = "/hm/v1/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@PostMapping(value = "/save")
	public ResponseEntity<?> saveAppointment(@RequestBody AppointmentRequest appointmentRequest) {

		Appointment appointment = appointmentService.createAppointment(appointmentRequest);
		return ResponseEntity.ok().body(appointment);

	}

	

}

