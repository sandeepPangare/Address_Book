package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contacts> ContactList = new ArrayList<Contacts>();

    public Contacts getContactInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the Address: ");
        String address = sc.nextLine();
        System.out.println("Enter the City: ");
        String city = sc.nextLine();
        System.out.println("Enter the State: ");
        String state = sc.nextLine();
        System.out.println("Enter the Zip: ");
        int zip = sc.nextInt();
        System.out.println("Enter the Phone No: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Email: ");
        String email = sc.nextLine();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, email,zip,phoneNumber);
        return contact;
    }
        //Creating a Method for AddNewCotact
    public void addContact(Contacts createPerson) {
        System.out.println("Adding a New Contacts for " + createPerson.firstName);
        ContactList.add(createPerson);
        System.out.println((createPerson));
    }
    //method used to edit the contact
    public void editContact() {
        boolean isContactFound = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contacts to Edit it");
        String cName = sc.nextLine();
        //Contacts class Object contact & Arraylist Class object ContactList
        for (Contacts contact : ContactList) {
            if (contact.getFirstName().equals(cName)) {
                //compare firstname to ContactList using .equals
                isContactFound = true;
                System.out.println("Which Details You Would Like To Edit ?");
                System.out.println("Press - 1 for First Name \nPress - 2 for Last Name \n" + "Press - 3 for Address \nPress - 4 for City \nPress - 5 for State \nPress - 6 for Zip \n" + "Press - 7 for Phone No. \nPress - 8 for Email");

                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("Enter New First Name");
                        sc.nextLine();
                        String fName = sc.nextLine();
                        contact.setFirstName(fName);
                        System.out.println("Update a Sucessfully " + fName);
                        break;
                    case 2:
                        System.out.println("Enter New Last Name");
                        sc.nextLine();
                        String lName = sc.nextLine();
                        contact.setLastName(lName);
                        System.out.println("Update a Sucessfully " + lName);
                        break;
                    case 3:
                        System.out.println("Enter New Address");
                        sc.nextLine();
                        String address = sc.nextLine();
                        contact.setAddress(address);
                        System.out.println("Update a Sucessfully " + address);
                        break;
                    case 4:
                        System.out.println("Enter New City");
                        sc.nextLine();
                        String city = sc.nextLine();
                        contact.setCity(city);
                        System.out.println("Update a Sucessfully " + city);
                        break;
                    case 5:
                        System.out.println("Enter New State");
                        sc.nextLine();
                        String state = sc.nextLine();
                        contact.setState(state);
                        System.out.println("Update a Sucessfully " + state);
                        break;
                    case 6:
                        System.out.println("Enter New Zip");
                        int zip = sc.nextInt();
                        contact.setZip(zip);
                        System.out.println("Update a Sucessfully " + zip);
                        break;
                    case 7:
                        System.out.println("Enter New Phone Number");
                        long phoneNumber = sc.nextLong();
                        contact.setPhoneNumber(phoneNumber);
                        System.out.println("Update a Sucessfully " + phoneNumber);
                        break;
                    case 8:
                        System.out.println("Enter New Email");
                        sc.nextLine();
                        String email = sc.nextLine();
                        contact.setEmail(email);
                        System.out.println("Update a Sucessfully " + email);
                        break;
                    default:
                        System.out.println("No Edit");
                }
                break;
            }

        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("No such contact");
        }
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contacts to Delete it");
        String cName = sc.nextLine();
        Contacts editContact = ContactList.get(cName.indexOf(cName));

        if (editContact.getFirstName().equals(cName)) {
            ContactList.remove(editContact);
        } else {
            System.out.println("No such Contacts to Delete");
        }
    }

    public void viewContacts() {

        if (ContactList.size() == 0) {
            System.out.println("No Contacts Here.");
        } else {

            for (int i = 0; i < ContactList.size(); i++) {
                int num = i + 1;
                System.out.println("Available Contacts In List: " + num);
                System.out.println("First Name: " + ContactList.get(i).firstName + " Last Name: " + ContactList.get(i).lastName);
                System.out.println("Address: " + ContactList.get(i).address + " City: " + ContactList.get(i).city + " State: " + ContactList.get(i).state + " Zip: " + ContactList.get(i).zip);
                System.out.println("Phone No: " + ContactList.get(i).phoneNumber);
                System.out.println("Email: " + ContactList.get(i).email);
            }
        }
    }
}