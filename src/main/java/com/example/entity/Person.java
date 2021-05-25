/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/24/2021
 *   Time: 12:58 PM
 *   File: Person.java
 */

package com.example.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Person {
    private String email;
    private String religion;
    private List<String> flavour;
    private String feedback;
    private boolean isCheck;

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", religion='" + religion + '\'' +
                ", flavour=" + flavour +
                ", feedback='" + feedback + '\'' +
                ", isCheck=" + isCheck +
                ", address=" + address +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return isCheck() == person.isCheck() && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getReligion(), person.getReligion()) && Objects.equals(getFlavour(), person.getFlavour()) && Objects.equals(getFeedback(), person.getFeedback()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getDate(), person.getDate());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getEmail(), getReligion(), getFlavour(), getFeedback(), isCheck(), getAddress(), getDate());
        return result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public List<String> getFlavour() {
        return flavour;
    }

    public void setFlavour(List<String> flavour) {
        this.flavour = flavour;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person() {
    }

    public Person(String email, String religion, List<String> flavour, String feedback, boolean isCheck, Address address, Date date) {
        this.email = email;
        this.religion = religion;
        this.flavour = flavour;
        this.feedback = feedback;
        this.isCheck = isCheck;
        this.address = address;
        this.date = date;
    }

    private Address address;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date date;
}