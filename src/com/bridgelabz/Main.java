package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Advanced Address Book");
        AddressBook addressBook = new AddressBook();
        addressBook.create();
        addressBook.add();
        System.out.println("contact is added");
    }
}