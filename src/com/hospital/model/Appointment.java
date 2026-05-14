package com.hospital.model;

import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String status ;
    private String reason;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String date, String status, String reason) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = status;
        this.reason = reason;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

}
