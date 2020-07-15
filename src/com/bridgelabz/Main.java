package com.bridgelabz;

import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        AddressBookManager addressBookManager = new AddressBookManager();

        int i=0;
        while (i==0){
        System.out.println("Enter 1 to create and enter 2 to open Address Book");    
        
        System.out.println("Enter ur choice");
        Scanner user_input = new Scanner(System.in);
        int choice = user_input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("creating new Address Book");
                addressBook.create();
                break;
            case 2:
                System.out.println("Opening new Address Book");
                addressBook.open();
                break;
            default:
                System.out.println("Try again");
                break;
            }
            i++;
        }
    }
}