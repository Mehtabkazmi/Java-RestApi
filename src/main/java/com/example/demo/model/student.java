package com.example.demo.model;

public class student {
    private String rollNum;
    private String Name;

    public student() {
    }

    public student(String rollNum, String Name) {
        this.rollNum = rollNum;
        this.Name = Name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
