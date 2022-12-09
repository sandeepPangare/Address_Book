package com.bridgelabz;


import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetails {
    static Scanner sc = new Scanner(System.in);

    public void manageAddressBook(String addressBook,ArrayList<Contacts> ContactList){
        int ch = 0;
        do{
            do {
        System.out.println("1.Adding Contacts \n2.Update Contacts \n3.Delete Contacts \n4.View Contacts\n5.Exit");
        System.out.println("Enter a Your Choice: ");
        ch = sc.nextInt();

                if (!(ch >=1 && ch <= 5))
                    System.out.println("Invalid Input");
            }while (!(ch >=1 && ch <= 5));

        switch (ch) {
            case 1:
                addContact(ContactList);
                System.out.println("Contacts Added Successfully");
                break;
            case 2:
                editContact(ContactList);
                System.out.println("Contacts Updated Successfully");
                break;
            case 3:
                deleteContact(ContactList);
                System.out.println("Contacts Delete Successfully");
                break;
            case 4:
                viewContacts(ContactList);
                System.out.println("Showing All Contacts Details");
                break;
            case 5:
                System.out.println("Thank You We are Exiting");
                break;
            default:
                System.out.println("Sorry You are Type Wrong Choice");
        }
    } while (ch != 5);
}


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
    public void addContact(ArrayList<Contacts> contactsArrayList) {
        Contacts contact = getContactInput();
        contactsArrayList.add(contact);
        System.out.println(contact);
    }
    //method used to edit the contact
    public void editContact(ArrayList<Contacts> contactList) {
        boolean isContactFound = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contacts to Edit it");
        String cName = sc.nextLine();
        //Contacts class Object contact & Arraylist Class object ContactList
        for (Contacts contact : contactList) {
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

    public void deleteContact(ArrayList<Contacts> contactList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contacts to Delete it");
        String cName = sc.nextLine();
        Contacts editContact = contactList.get(cName.indexOf(cName));

        if (editContact.getFirstName().equals(cName)) {
            contactList.remove(editContact);
        } else {
            System.out.println("No such Contacts to Delete");
        }
    }
    public void displayAddressBook(String addressbook, ArrayList<Contacts> contactList) {
        //Create method and pass Parameter
        System.out.println("\n\n------- " + addressbook + " Address Book -------");
        for (int i = 0; i < contactList.size(); i++)
            System.out.println("\n"+contactList.get(i));
        System.out.println();
    }

    public void viewContacts(ArrayList<Contacts> contactList) {

        if (contactList.size() == 0) {
            System.out.println("No Contacts Here.");
        } else {

            for (int i = 0; i < contactList.size(); i++) {
                int num = i + 1;
                System.out.println("Available Contacts In List: " + num);
                System.out.println("First Name: " + contactList.get(i).firstName + " Last Name: " + contactList.get(i).lastName);
                System.out.println("Address: " + contactList.get(i).address + " City: " + contactList.get(i).city + " State: " + contactList.get(i).state + " Zip: " + contactList.get(i).zip);
                System.out.println("Phone No: " + contactList.get(i).phoneNumber);
                System.out.println("Email: " + contactList.get(i).email);
            }
        }
    }
}