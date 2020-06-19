package com.bridgelabz;
import java.lang.String;

public class Person {
    String firstName;
    String lastName;
    String city;
    String state;
    String zip;
    String phoneNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n\t\t\tPerson \n\t\t\tFirstName :" +firstName + "\n\t\t\tLast Name :" +lastName + "\n\t\t\tCity :" +city + "\n\t\t\tState :"+state + "\n\t\t\tZip :" +zip + "\n\t\t\tPhoneNumber: " +phoneNumber + "\n\t";
    }
}
