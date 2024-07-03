package com.example.JavaAssignment.repository;

import com.example.JavaAssignment.entity.Doctor;
//import com.example.JavaAssignment.special.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor,Long> {
    List<Doctor> findByCityAndSpeciality(String city, String speciality);
}
