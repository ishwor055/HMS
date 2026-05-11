package com.hospital.model;

public abstract class Person {
    private String name;
    private int age;
    private String id;

    Person (String name, int age, String id ){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public abstract String getDetails();

}
