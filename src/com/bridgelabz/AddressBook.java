package com.bridgelabz;

import java.io.*;
import java.util.Scanner;


public class AddressBook {
    static Scanner utility = new Scanner(System.in);
    public static File file;
    private static AddressBookManager list;

    public void create() {
        try {
            System.out.println("Enter the name of address book");
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
                    do {
                        System.out.println("1. Add\n2. Edit\n3. Print\n4.Remove\n5.Sort By Name\n6.Sort By Zip\n7.Sort By City\n8.Sort By State\n9.View Person By City\n10.View Person By State\n11.Exit");
                        int option = utility.nextInt();
                        AddressBookManager addressBookManager = new AddressBookManager();
                        switch (option) {
                            case 1:
                                addressBookManager.add();
                                System.out.println("Contact is added");
                                break;
                            case 2:
                                addressBookManager.edit();
                                System.out.println("Contact is edited");
                                break;
                            case 3:
                                addressBookManager.printAll();
                                System.out.println("All contacts are shown upto date");
                                break;
                            case 4:
                                addressBookManager.remove();
                                break;
                            case 5:
                                addressBookManager.sortByName();
                                break;
                            case 6:
                                addressBookManager.sortByZip();
                                break;
                            case 7:
                                addressBookManager.sortByCity();
                                break;
                            case 8:
                                addressBookManager.sortByState();
                                break;
                            case 9:
                                addressBookManager.viewPersonByCity();
                                break;
                            case 10:
                                addressBookManager.viewPersonByState();
                                break;
                            case 11:
                                i = 1;
                                break;
                            default:
                                System.out.println("Select anything before you proceed");
                                break;
                        }
                    } while (i == 0);
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
