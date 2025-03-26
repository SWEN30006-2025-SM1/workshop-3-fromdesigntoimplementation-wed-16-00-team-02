package com.unimelb.swen30006.workshops;
import java.time.LocalDate
public class Student extends Person {
    private String address;
    private LocalDate dob;
    private String name;
    private String email;
    private String studentID;

    public Student(String address, LocalDate dob, String name, String email, String ID) {
        super(address, dob, name);
        this.email = email;
        this.studentID = ID;
    }

    public void sendEmailMsg(String msg) {
        System.out.println(email);
    }

    public float totalGrade() {
        System.out.println(studentID);
    }
}
