package com.demo2.springboot.hospitalmanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.springboot.hospitalmanagement.dao.DoctorDao;
import com.demo2.springboot.hospitalmanagement.dao.AppointmentDao;
import com.demo2.springboot.hospitalmanagement.dao.PatientDao;
import com.demo2.springboot.hospitalmanagement.request.AppointmentRequest;

import java.util.List;
import java.util.Optional;
import com.demo2.springboot.hospitalmanagement.model.Doctor;
import com.demo2.springboot.hospitalmanagement.model.Appointment;
import com.demo2.springboot.hospitalmanagement.model.Patient;


@Service
public class AppointmentService {

	
	@Autowired
	private AppointmentDao appointmentDao;
	
	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	private PatientDao patientDao;
	
	
	public Appointment createAppointment(AppointmentRequest appointmentRequest) {
		
		Appointment appointment = new Appointment();
		appointment.setAppointmentDate(appointmentRequest.getAppointmentDate());
		appointment.setSymptoms(appointmentRequest.getSymptoms());
		appointment.setDiagnosis(appointmentRequest.getDiagnosis());
		appointment.setPrescription(appointmentRequest.getPrescription());
		
	
		
		
		Optional<Doctor> doc =  doctorDao.findById(appointmentRequest.getDoctorId());
		Optional<Patient> pat = patientDao.findById(appointmentRequest.getPatientId());
		
		
		appointment.setDoctor(doc.get());
		appointment.setPatient(pat.get());
	    appointment = appointmentDao.save(appointment);
		
		return appointment;
		
	}
	
}
	




