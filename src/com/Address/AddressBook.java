package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<ContactDetails> contactlist = new ArrayList<>();
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

    public static void main(String[] args) {
        AddressBook list = new AddressBook();
        list.addNewContact();
        for(ContactDetails list2 : list.contactlist){
            System.out.println(list2);
        }
    }

}
