package com.demo2.springboot.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.springboot.hospitalmanagement.model.MedicalRecord;
import com.demo2.springboot.hospitalmanagement.request.MedicalRecordRequest;
import com.demo2.springboot.hospitalmanagement.service.MedicalRecordService;

@RestController
@RequestMapping(value = "/hm/v1/medicalRecord")
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordService;

	@PostMapping(value = "/save")
	public ResponseEntity<?> saveMedicalRecord(@RequestBody MedicalRecordRequest medicalRecordRequest) {

		MedicalRecord medicalRecord = medicalRecordService.createMedicalRecord(medicalRecordRequest);
		return ResponseEntity.ok().body(medicalRecord);

	}

	

}
