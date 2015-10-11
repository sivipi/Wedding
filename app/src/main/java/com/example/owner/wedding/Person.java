package com.example.owner.wedding;

import java.util.Date;

/**
 * Created by Shelly on 11/10/2015.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private Date birthdate;
    private String email;

    public Person(String firstName, String lastName, String address, Date birthdate, String email) {
        this(firstName,lastName,address,email);
        this.birthdate = birthdate;
    }

    public Person(String firstName, String lastName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
