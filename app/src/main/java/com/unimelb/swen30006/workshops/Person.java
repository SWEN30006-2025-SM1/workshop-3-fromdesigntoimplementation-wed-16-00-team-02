package com.unimelb.swen30006.workshops;
import java.time.LocalDate;
abstract class Person {
    private String address;
    private LocalDate dob;
    private String name;

    public Person(String address, LocalDate dob, String name) {
        this.address = address;
        this.dob = dob;
        this.name = name;
    }

}
