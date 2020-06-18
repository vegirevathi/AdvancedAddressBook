package com.bridgelabz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
    public static List<Person> list = new ArrayList<Person>();
    static Person person = new Person();
    static AddressBook addressBook = new AddressBook();
    static AddressBookManager addressBookManager = new AddressBookManager();
    static Scanner utility = new Scanner(System.in);
    private static File file;

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

    public Person edit() {
        System.out.println("Enter first name");
        String firstName = utility.next();
        Address address = new Address();
        int count = 0;

        for (Person P : list) {
            if (firstName.equals(P.getFirstName())) {
                count++;
                System.out.println("Data found\n");
                System.out.println("1.To edit Address\n"
                        + "2.To edit Phone Number\n"
                        + "3.To edit City\n"
                        + "4.To edit State\n"
                        + "5.To edit Zip");
                int editChoice = utility.nextInt();
                switch(editChoice) {
                    case 1:
                        P.setAddress(address);
                        break;
                    case 2:
                        P.setPhoneNumber(utility.next());
                        break;
                    case 3:
                        address.setCity(utility.next());
                        break;
                    case 4:
                        address.setState(utility.next());
                        break;
                    case 5:
                        address.setZip(utility.next());
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

    public void remove() throws Exception {
        System.out.println("Enter first name whose data is to be removed");
        String firstName = utility.next();
        int count = 0;
        List<Person> list = new ArrayList<>();
        for (Person P : list) {
            if (firstName.contentEquals(P.getFirstName())) {
                list.remove(P);
                count++;
                System.out.println("Data removed");
            }
        }
        //List removeAll(listRemove);
        if (count == 0)
            System.out.println("No such data found");
    }

    public static void addToFile(Person person) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(person.getFirstName()+"\r\n" + person.getLastName() + "\r\n" + person.getPhoneNumber() + "\r\n");
            System.out.println("Contact information is added into file");
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static boolean readPeopleFromFile() throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String phoneNumber = null;
            while((phoneNumber = reader.readLine()) != null) ;
                Person person = new Person(name, reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine());
                list.add(addUser());        //adds person to the list
                reader.readLine();
            }
            return true;
        }
        catch ( IOException e) {
            System.out.println(e);
        }
        return false;
}

