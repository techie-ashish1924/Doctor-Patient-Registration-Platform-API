package com.example.JavaAssignment.controller;

import com.example.JavaAssignment.entity.Doctor;
import com.example.JavaAssignment.entity.Patient;
import com.example.JavaAssignment.services.DoctorService;
import com.example.JavaAssignment.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add-patient")
    public ResponseEntity<?> addPatient(@RequestBody @Valid Patient patient) {

        if ( !Arrays.asList("arthritis", "back pain", "tissue injuries","dysmenorrhea","skin infection","skin burn","ear pain").contains(patient.getSymptom().toLowerCase().trim()) ) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input: patient symptom is not matching");

        }
        patient.setCity(patient.getCity().toUpperCase());
        patient.setSymptom(patient.getSymptom().toUpperCase());
        Patient savedPatient = patientService.addPatient(patient);
        return ResponseEntity.ok(savedPatient);
    }

    @DeleteMapping("remove-patient/{id}")
    public ResponseEntity<?> removePatient(@PathVariable Long id) {
        patientService.removePatient(id);

        return ResponseEntity.status(HttpStatus.OK).body(id + " : this id patient has been removed");

    }

    @GetMapping("/suggest-doctor/{patientId}")
    public ResponseEntity<?> suggestDoctor(@PathVariable Long patientId) {
        Patient patient = patientService.getPatient(patientId);

        System.out.println("Patient name : " + patient.getName());

        List<?> doctors = doctorService.findDoctorsBySymptomAndLocation(patient.getSymptom(), patient.getCity());

//        System.out.println("Doctor name : " + doctors);

        if (doctors.isEmpty()) {

            return new ResponseEntity<>("There isn’t any doctor present at your location for your symptom", HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(doctors);
    }

    @GetMapping("/all-patients")
    public ResponseEntity<List<Patient>> findAllDoctors() {
        List<Patient> patients = patientService.findAll();
        return ResponseEntity.ok(patients);
    }
}



