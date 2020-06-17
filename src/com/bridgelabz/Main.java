package com.bridgelabz;

import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Advanced Address Book");
        AddressBook addressBook = new AddressBook();
        AddressBookManager addressBookManager = new AddressBookManager();
        addressBook.create();
        addressBookManager.add();
        addToFile();
        addressBook.readPeopleFromFile();
        System.out.println("contact is added");
    }
}