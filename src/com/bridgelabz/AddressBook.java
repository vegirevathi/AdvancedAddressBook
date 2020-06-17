package com.bridgelabz;

import java.io.*;
import java.util.Scanner;


public class AddressBook {
    static Scanner utility = new Scanner(System.in);
    private static File file;
    private static AddressBookManager list;

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


    public static void addToFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            Person person = new Person();
            writer.write(person.getFirstName()+"\r\n" + person.getLastName() + "\r\n" + person.getPhoneNumber() + "\r\n");
            System.out.println("Contact information is added into file");
        } catch(IOException e) {
            System.out.println(e);
        }
	}

	 public static boolean readPeopleFromFile() throws IOException {
	        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String name = null;
	            while((name = reader.readLine()) != null) {
	                Person person = new Person();
                    list.add();
                    reader.readLine();
	            }
	            return true;
	        }
	        catch ( IOException e) {
	            System.out.println(e);
	        }
	        return false;
	    }
}
