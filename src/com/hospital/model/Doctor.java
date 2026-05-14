package com.hospital.model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Doctor extends Person{
    private String specialization;
    private String contact;
    private String departent;
    private Date schedule;


    public Doctor(String name, int age, String id, String specialization, String contact, String departent, Date schedule) {
        super(name, age, id);
        this.specialization = specialization;
        this.contact = contact;
        this.departent = departent;
        this.schedule = schedule;
    }

    @Override
    public String getDetails() {
        return null;
    }
}
