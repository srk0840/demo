package com.example.demo.Application;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;


public class Student {
    private String name;
    private String teacherName;
    private String address;
    private String phoneNo;
    private String fatherName;
    private String motherName;

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Student(String name, String teacherName, String address, String phoneNo, String fatherName, String motherName) {
        this.name = name;
        this.teacherName = teacherName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

}
