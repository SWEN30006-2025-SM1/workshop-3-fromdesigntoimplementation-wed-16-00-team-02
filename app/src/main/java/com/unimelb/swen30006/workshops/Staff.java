package com.unimelb.swen30006.workshops;

import java.time.LocalDate;

public class Staff extends Person{
    private String address;
    private LocalDate dob;
    private String name;
    private String[] roles;
    private String staffID;

    public Staff(String address, LocalDate dob, String name, String[] roles, String ID) {
        super(address, dob, name);
        this.roles = roles;
        this.staffID = ID;
    }
}
