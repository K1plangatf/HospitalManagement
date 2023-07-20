package com.demo2.springboot.hospitalmanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.springboot.hospitalmanagement.dao.DoctorDao;
import com.demo2.springboot.hospitalmanagement.dao.MedicalRecordDao;
import com.demo2.springboot.hospitalmanagement.dao.PatientDao;
import com.demo2.springboot.hospitalmanagement.request.MedicalRecordRequest;

//import java.util.List;
import java.util.Optional;
import com.demo2.springboot.hospitalmanagement.model.Doctor;
import com.demo2.springboot.hospitalmanagement.model.MedicalRecord;
import com.demo2.springboot.hospitalmanagement.model.Patient;


@Service
public class MedicalRecordService {

	
	@Autowired
	private MedicalRecordDao medicalRecordDao;
	
	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	private PatientDao patientDao;
	
	
	public MedicalRecord createMedicalRecord(MedicalRecordRequest medicalRecordRequest) {
		
		MedicalRecord medicalRecord = new MedicalRecord();
		medicalRecord.setDate(medicalRecordRequest.getDate());
		medicalRecord.setNotes(medicalRecordRequest.getNotes());
		
	
		
		
		Optional<Doctor> doc =  doctorDao.findById(medicalRecordRequest.getDoctorId());
		Optional<Patient> pat = patientDao.findById(medicalRecordRequest.getPatientId());
		
		
		medicalRecord.setDoctor(doc.get());
		medicalRecord.setPatient(pat.get());
	    medicalRecord = medicalRecordDao.save(medicalRecord);
		
		return medicalRecord;
		
	}
	
}
	



