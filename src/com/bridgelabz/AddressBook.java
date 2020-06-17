package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
    Scanner utility = new Scanner(System.in);
    public static List<Person> list = new ArrayList<Person>();

    public void create() {
        try {
            System.out.println("enter the name of address book");
            String NewAddressBookName = utility.next();
            File file = new File(NewAddressBookName + ".csv");

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File is created as " +NewAddressBookName + ".csv");
            }
            else {
                System.out.println("File already exists");
            }
            }catch (IOException e) {
            e.printStackTrace();
        }
        }
    public List<Person> add() {
        list.add(addUser());
        for (Person P : list) {
            System.out.println(P.toString());
        }
        return list;
    }
    private Person addUser() {
        Person person = new Person();
        Address address = new Address();
        System.out.println("Enter First Name: ");
        person.setFirstName(utility.next());
        System.out.println(person.getFirstName());
        System.out.println("Enter Last Name: ");
        person.setLastName(utility.next());
        System.out.println("Enter city");
        address.setCity(utility.next());
        System.out.println("Enter state");
        address.setState(utility.next());
        System.out.println("Enter zip code");
        address.setZip(utility.next());
        System.out.println("Enter phone number");
        person.setPhoneNumber(utility.next());
        person.setAddress(address);
        return person;
        /* addToFile(person); */
    }
}
