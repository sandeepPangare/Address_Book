package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Contacts> personDetail = personDetail = new ArrayList<Contacts>();

    // add new person record to array list after taking input

    public void addPerson() {
        System.out.print("Enter the First Name =>");
        String firstName = scanner.next();
        System.out.print("Enter the Last Name =>");
        String lastName = scanner.next();
        System.out.print("Enter the Address =>");
        String address = scanner.next();
        System.out.print("Enter the City =>");
        String city = scanner.next();
        System.out.print("Enter the State =>");
        String state = scanner.next();
        System.out.print("Enter the Zip Code =>");
        String zip = scanner.next();
        System.out.print("Enter the PhoneNumber =>");
        String phoneNumber = scanner.next();
        System.out.print("Enter the Email =>");
        String emailId = scanner.next();

        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);

        personDetail.add(contacts);

        System.out.println(contacts);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBookMain class");
        AddressBookMain ab = new AddressBookMain();
        ab.addPerson();
    }
}