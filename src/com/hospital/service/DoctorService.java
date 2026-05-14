package com.hospital.service;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;

public class DoctorService {
    private DoctorRepository doctorRepository = new DoctorRepository();

    public void registerNewDoctor(Doctor doctor){
        doctorRepository.registerNewDoctor(doctor);
    }

    public Doctor findDoctorById(String doctorId){
        return doctorRepository.findById(doctorId);
    }

}
