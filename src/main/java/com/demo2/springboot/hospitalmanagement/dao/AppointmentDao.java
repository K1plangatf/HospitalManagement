package com.demo2.springboot.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.springboot.hospitalmanagement.model.Appointment;



public interface AppointmentDao extends JpaRepository<Appointment, Long> {

}
