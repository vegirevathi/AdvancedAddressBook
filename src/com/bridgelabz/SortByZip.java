package com.bridgelabz;
import java.util.Comparator;

public class SortByZip implements Comparator<Address> {
    public int compare(Address firstPerson, Address secondPerson) {
        if (firstPerson.getZip().contentEquals(secondPerson.getZip()))
            return 0;
        else {
            if (firstPerson.getZip().compareTo(secondPerson.getZip()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public Comparator<Address> thenComparing(Comparator<? super Address> other) {
        return null;
    }
}
