package com.bridgelabz;

public class AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        Contact contacts = new Contact("Sandeep","Pangare","Nandurbar","Nandurbar","Maharashtra","pangaresandeep96@gmail.com","425424","7767029534");

        System.out.println("First Name => "+contacts.getFirstName());
        System.out.println("Last Name => "+contacts.getLastName());
        System.out.println("Address => "+contacts.getAddress());
        System.out.println("City => "+contacts.getCity());
        System.out.println("State => "+contacts.getState());
        System.out.println("Email => "+contacts.getEmail());
        System.out.println("Phone Number => "+contacts.getPhoneNumber());

    }
}
