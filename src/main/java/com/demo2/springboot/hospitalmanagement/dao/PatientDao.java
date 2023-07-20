package com.demo2.springboot.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo2.springboot.hospitalmanagement.model.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>  {

	@Query(nativeQuery = true, value ="select count(*) from md_patient" )
	public int countPatient();
}
