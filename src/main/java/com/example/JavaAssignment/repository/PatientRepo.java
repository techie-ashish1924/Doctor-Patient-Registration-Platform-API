package com.example.JavaAssignment.repository;

import com.example.JavaAssignment.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {


}
