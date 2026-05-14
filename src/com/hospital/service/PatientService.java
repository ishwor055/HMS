package com.hospital.service;

import com.hospital.model.Patient;
import com.hospital.repository.PatientRepository;

public class PatientService {
    private PatientRepository patientRepository = new PatientRepository();

    public void registerNewPatient(Patient patient){
        patientRepository.registerNewPatient(patient);
    }

    public Patient findPatientById(String patientId){
        return patientRepository.findById(patientId);
    }


}
