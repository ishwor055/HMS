package com.hospital.service;

import com.hospital.model.Appointment;
import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.repository.AppointmentRepository;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.PatientRepository;

public class AppointmentService {
    private PatientRepository patientRepository;
    private DoctorRepository doctorRepository;
    private AppointmentRepository appointmentRepository;

    public AppointmentService(PatientRepository patientRepository, DoctorRepository doctorRepository, AppointmentRepository appointmentRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
    }
    public void bookAppointment(String patientId, String doctorId, String appointmentId, String appointmentDate, String status, String reason) {

        Patient patient = patientRepository.findById(patientId);
        Doctor doctor = doctorRepository.findById(doctorId);
        Appointment appointment =   new Appointment(appointmentId, patient, doctor, appointmentDate, status, reason);

        appointmentRepository.save(appointment);
    }
}