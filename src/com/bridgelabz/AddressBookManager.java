package com.bridgelabz;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
    public static List<Person> list = new ArrayList<Person>();
    static Person person = new Person();
    static AddressBook addressBook = new AddressBook();
    static AddressBookManager addressBookManager = new AddressBookManager();
    static Scanner utility = new Scanner(System.in);

    HashMap<String,Person>cityMap = new HashMap<String,Person>();
    HashMap<String,Person>stateMap = new HashMap<String,Person>();

    public List<Person> add() {
        list.add(addUser());
        cityMap.put(person.getCity(),person);
        stateMap.put(person.getState(),person);
        for (Person P : list) {
            System.out.println(P.toString());
        }
        return list;
    }

    public Person addUser() {
        Person person = new Person();
        System.out.println("Enter First Name: ");
        person.setFirstName(utility.next());
        System.out.println("Enter Last Name: ");
        person.setLastName(utility.next());
        System.out.println("Enter city");
        person.setCity(utility.next());
        System.out.println("Enter state");
        person.setState(utility.next());
        System.out.println("Enter zip code");
        person.setZip(utility.next());
        System.out.println("Enter phone number");
        person.setPhoneNumber(utility.next());
        return person;
    }

    public void edit() {
        System.out.println("Enter first name");
        String firstName = utility.next();
        int count = 0;

        for (Person P : list) {
            if (firstName.equals(P.getFirstName())) {
                count++;
                System.out.println("Data found\n");
                System.out.println("1.To edit phoneNumber\n2.To edit city\n3.To edit State\n4.To edit zip");

                int editChoice = utility.nextInt();
                switch(editChoice) {
                    case 1:
                        P.setPhoneNumber(utility.next());
                        break;
                    case 2:
                        P.setCity(utility.next());
                        break;
                    case 3:
                        P.setState(utility.next());
                        break;
                    case 4:
                        P.setZip(utility.next());
                        break;
                    default:
                        System.out.println("No Changes are made\n");
                        break;
                }
            }
        }
        if (count==0)
            System.out.println("Data not found");
    }

    public void printAll() {
        for (Person P : list) {
            System.out.println(P.toString());
        }
    }

    public void remove() {
        System.out.println("Enter first name whose data is to be removed");
        String firstName = utility.next();
        int count = 0;
        for (Person P : list) {
            if (firstName.contentEquals(P.getFirstName())) {
                list.remove(P);
                count++;
                System.out.println("Data removed");
            }
            else {
                System.out.println("No such data found");
            }
        }
    }

    public void sortByName() {
        Collections.sort(list, new SortByName());
        System.out.println("Sorted by name");
    }
    public void sortByZip() {
        Collections.sort(list, new SortByZip());
        System.out.println("Sorted by zip");
    }

    public void sortByCity() {
        Collections.sort(list, new SortByCity());
        System.out.println("Sorted by zip");
    }

    public void sortByState() {
        Collections.sort(list, new SortByState());
        System.out.println("Sorted by zip");
    }

    public void viewPersonByCity() {
        System.out.println("Enter city");
        String city=utility.next();
        System.out.println(cityMap.get(person.getCity()));
    }

    public void viewPersonByState(){
        System.out.println("Enter state");
        String state=utility.next();
        System.out.println(stateMap.get(state));
    }
}


