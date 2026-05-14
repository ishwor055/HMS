package com.hospital.service;

import com.hospital.model.Appointment;

import java.util.HashMap;
import java.util.Map;

public class AppointmentRepository {
    private Map<String, Appointment> appointments = new HashMap<>();

    public void save(Appointment appointment) {
        appointments.put(appointment.getAppointmentId(), appointment);
        System.out.println("Appointment saved successfully.");
    }

    public Appointment findById(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
