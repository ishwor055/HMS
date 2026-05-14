package com.hospital.repository;

import com.hospital.model.Doctor;

import java.util.HashMap;
import java.util.Map;

public class DoctorRepository {

    Map<String, Doctor> doctorMap = new HashMap<>();
    public void registerNewDoctor(Doctor doctor){
        doctorMap.put(doctor.getId(), doctor);
        System.out.println("Patient is registered.. ");
    }

    public Doctor findById(String id){
        return doctorMap.get(id);
    }
}
