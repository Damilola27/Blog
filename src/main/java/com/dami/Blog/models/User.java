package com.dami.Blog.models;

public class User {
    private String firstName;
    private String lastname;
    private String gender;
    private int age;
    private  int id;
    private static int idGenerator;

    public User(String firstName, String lastname, String gender, int age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        idGenerator++;
        id = idGenerator;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
