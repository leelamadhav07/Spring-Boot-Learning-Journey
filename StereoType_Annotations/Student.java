package com.example.SpringApp3;

public class Student {
    private int id;
    private String name;

    // Constructors
    public Student() {}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
