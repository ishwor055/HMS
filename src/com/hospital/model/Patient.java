package com.hospital.model;

import java.util.Date;
import java.util.List;

public class Patient extends Person{

    private String patientId;
    private String name;
    private int age;
    private char sex;
    private Date dob;
    private List<String> symptoms;

    public Patient(String name, int age, String id, String patientId, String name1, int age1, char sex, Date dob, List<String> symptoms) {
        super(name, age, id);
        this.patientId = patientId;
        this.name = name1;
        this.age = age1;
        this.sex = sex;
        this.dob = dob;
        this.symptoms = symptoms;
    }

    @Override
    public String getDetails() {
        return null;
    }
}
