package com.bridgelabz;
import java.util.Comparator;

public class SortByName implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        return (firstPerson.getLastName().compareTo(secondPerson.getLastName()));
    }
}

class SortByCity implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        return (firstPerson.getCity().compareTo(secondPerson.getCity()));
    }
}

class SortByState implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        return (firstPerson.getState().compareTo(secondPerson.getState()));
    }
}

class SortByZip implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        return (firstPerson.getZip().compareTo(secondPerson.getZip()));
    }
}