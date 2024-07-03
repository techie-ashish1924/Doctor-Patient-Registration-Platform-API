package com.example.JavaAssignment.services;

import com.example.JavaAssignment.entity.Patient;
import com.example.JavaAssignment.exceptionHandling.ResourceNotFoundException;
import com.example.JavaAssignment.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public void removePatient(Long id) {
        patientRepo.deleteById(id);
    }

    public Patient getPatient(Long id) {
        return patientRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }

    public List<Patient> findAll() {
        return patientRepo.findAll();
    }
}

