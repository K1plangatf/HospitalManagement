package com.demo2.springboot.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo2.springboot.hospitalmanagement.model.Doctor;


@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long>  {

}
