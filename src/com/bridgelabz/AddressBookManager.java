package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
    public static List<Person> list = new ArrayList<Person>();
    static Person person = new Person();
    static Scanner utility = new Scanner(System.in);

    public List<Person> add() {
        list.add(addUser());
        for (Person P : list) {
            System.out.println(P.toString());
        }
        return list;
    }
    public static Person addUser() {
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
    }
}
