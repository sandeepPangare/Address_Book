package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book System");
        int ch;
        Scanner sc = new Scanner(System.in);
        AddressBook AD = new AddressBook();

        do {
            System.out.println("1.Adding Contacts \n2.Update Contacts \n3.Delete Contacts \n4.View Contacts\n5.Exit");
            System.out.println("Enter a Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Contacts Contact = AD.getContactInput();
                    AD.addContact(Contact);
                    System.out.println("Contacts Added Successfully");
                    break;
                case 2:
                    AD.editContact();
                    System.out.println("Contacts Updated Successfully");
                    break;
                case 3:
                    AD.deleteContact();
                    System.out.println("Contacts Delete Successfully");
                    break;
                case 4:
                    System.out.println("Showing All Contacts Details");
                    AD.viewContacts();
                    break;
                case 5:
                    System.out.println("Thank You We are Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry You are Type Wrong Choice");
            }
        }
        while (true);
    }
}
