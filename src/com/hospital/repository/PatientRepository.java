package com.hospital.repository;

import com.hospital.model.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientRepository {

    Map<String,Patient> patientMap = new HashMap<>();
    public void registerNewPatient(Patient patient){
        patientMap.put(patient.getId(), patient);
        System.out.println("Patient is registered.. ");
    }

    public Patient findById(String id){
        return patientMap.get(id);
    }

}
