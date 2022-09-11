package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<ContactDetails> contactlist = new ArrayList<>();

    // Ability to add a new Contact to Address Book
    public void addNewContact() {
        ContactDetails contacts = new ContactDetails();
        System.out.println("Enter the Contact Details -");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.nextLine());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.nextLine());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.nextLine());
        System.out.println("Enter the City :");
        contacts.setCity(sc.nextLine());
        System.out.println("Enter the State :");
        contacts.setState(sc.nextLine());
        System.out.println("Enter the Zip Code :");
        contacts.setZipcode(sc.nextLine());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.nextLine());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.nextLine());
        contactlist.add(contacts);
    }
// UC3-Ability to edit existing contact person using their name
    public void editContact() {

        System.out.println("Enter the First Name : ");
        String firstName = sc.nextLine();


        boolean isAvailable = false;
        for (ContactDetails contact : contactlist) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                System.out.println("Enter the Last Name :");
                contact.setLastName(sc.nextLine());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.nextLine());
                System.out.println("Enter the City :");
                contact.setCity(sc.nextLine());
                System.out.println("Enter the State :");
                contact.setState(sc.nextLine());
                System.out.println("Enter the Zip Code :");
                contact.setZipcode(sc.nextLine());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNo(sc.nextLine());
                System.out.println("Enter the EMail ID :");
                contact.setEmail(sc.nextLine());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }
// UC4-delete a person using person's name
    public void deleteContact() {

        System.out.println("Enter the First Name : ");
        String firstName = sc.next();


        boolean isAvailable = false;
        for (ContactDetails contact : contactlist) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                contactlist.remove(contact);
                System.out.println("Contact Deleted.");
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    public static void main(String[] args) {
        AddressBook list = new AddressBook();
        list.addNewContact();
        for(ContactDetails list2 : list.contactlist){
            System.out.println(list2);
        }
        list.editContact();
        list.deleteContact();
        System.out.println(list.contactlist);
    }

}
