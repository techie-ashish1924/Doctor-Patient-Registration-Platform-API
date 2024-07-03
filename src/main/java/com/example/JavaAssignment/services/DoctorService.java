package com.example.JavaAssignment.services;

import com.example.JavaAssignment.entity.Doctor;
import com.example.JavaAssignment.repository.DoctorRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    public void removeDoctor(Long id) {
        doctorRepo.deleteById(id);
    }

    public List<?> findDoctorsBySymptomAndLocation(String symptom, String city) {

//        System.out.println("Find Doctor By symptoms function runnint");
        String speciality = getSpecialityBySymptom(symptom);

        System.out.println("Specialtity : " + speciality);
        System.out.println("City : " + city);

        if (!Arrays.asList("DELHI", "NOIDA", "FARIDABAD").contains(city)) {

            return Arrays.asList("We are still waiting to expand to your location");
        }
        return doctorRepo.findByCityAndSpeciality(city, speciality);
    }

    private String getSpecialityBySymptom(String symptom) {

        if(symptom.equals("ARTHRITIS") || symptom.equals("BACK PAIN") || symptom.equals("TISSUE INJURIES"))
        {
            return "ORTHOPAEDIC";
        }
        else if(symptom.equals("DYSMENORRHEA"))
        {
            return "GYNECOLOGY";
        }
        else if(symptom.equals("SKIN INFECTION") || symptom.equals("SKIN BURN"))
        {
            return "DERMATOLOGY";
        }
        else if(symptom.equals("EAR PAIN"))
        {
            return "ENT";
        }
        else{
            throw new IllegalArgumentException("Unknown symptom: " + symptom);
        }

    }

    public List<Doctor> findAll() {
        return doctorRepo.findAll();
    }
}



