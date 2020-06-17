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

    public static void open() {
        try {
            File f = new File("C:");
            String[] files = f.list();
            System.out.println("Files are:");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
            System.out.println("Enter the name of the address book which you want to open");
            String OpenAddressBookName = utility.next();
            File openFile = new File( OpenAddressBookName+ ".csv");

            if(openFile.exists()) {
                System.out.println("File exists");
                RandomAccessFile raf = new RandomAccessFile(openFile, "rw");
                int i = 0;
                while (i == 0) {
                    System.out.println("1. Add\n2. Edit\n3. Print\n");
                    int option = utility.nextInt();
                    AddressBookManager addressBookManager = new AddressBookManager();
                    switch(option) {
                        case 1:
                            addressBookManager.add();
                            System.out.println("contact is added");
                            break;
                        case 2:
                            addressBookManager.edit();
                            System.out.println("contact is edited");
                            break;
                        case 3:
                            addressBookManager.printAll();
                            System.out.println("All contacts are shown upto date");
                            break;
                        default:
                            System.out.println("Select anything before you proceed");
                            break;
                    }
                    i++;
                }
                boolean found = false;
                raf.close();
                while (i == 0) {
                    System.out.println(
                            "1. Save the changes\n"
                                    + "2. Dont save the changes\n");
                    int choice = utility.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.println("last changes have been saved");
                            break;
                        case 2:
                            System.out.println("last changes are not saved");
                            break;
                        default:
                            System.out.println("Something went wrong");
                            break;
                    }
                }
            }
            else {
                System.out.println("File name does not exists");
                AddressBook.open();
            }
        }
        catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
