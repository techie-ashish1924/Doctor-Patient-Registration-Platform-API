package com.example.JavaAssignment.controller;


import com.example.JavaAssignment.entity.Doctor;
import com.example.JavaAssignment.repository.DoctorRepo;
import com.example.JavaAssignment.services.DoctorService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

//    @Autowired
//    private DoctorRepo doctorRepo;



    @PostMapping("/add-doctor")
    public ResponseEntity<?> addDoctor(@RequestBody @Valid Doctor doctor) {


        if (!Arrays.asList("delhi", "noida", "faridabad").contains(doctor.getCity().toLowerCase().trim())  ||  !Arrays.asList("orthopaedic", "gynecology", "dermatology","ent").contains(doctor.getSpeciality().toLowerCase().trim()) ) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input: location or speciality is mismatching");

        }

        doctor.setCity(doctor.getCity().toUpperCase());
        doctor.setSpeciality(doctor.getSpeciality().toUpperCase());
        Doctor savedDoctor = doctorService.addDoctor(doctor);
        return ResponseEntity.ok(savedDoctor);

    }

    @DeleteMapping("/remove-doctor/{id}")
    public ResponseEntity<?> removeDoctor(@PathVariable Long id) {
        doctorService.removeDoctor(id);
        return ResponseEntity.status(HttpStatus.OK).body(id + "This id doctor has been removed ");
    }

    @GetMapping("/all-doctors")
    public ResponseEntity<List<Doctor>> findAllDoctors() {
        List<Doctor> doctors = doctorService.findAll();
        return ResponseEntity.ok(doctors);
    }


}



