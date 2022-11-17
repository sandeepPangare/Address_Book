package com.bridgelabz;

public class Contact {
    private String firstName,lastName,address,city,state,email,zip,phoneNumber;
    public Contact(String firstName, String lastName, String address, String city, String state, String email, String zip, String phoneNumber) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getEmail() {
        return email;
    }
    public String getZip() {
        return zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
