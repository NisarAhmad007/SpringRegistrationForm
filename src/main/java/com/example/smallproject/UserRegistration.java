package com.example.smallproject;

import java.util.Arrays;

public class UserRegistration {
    private String UName;

    @Override
    public String toString() {
        return "UserRegistration{" +
                "UName='" + UName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender=" + Gender +
                ", Hobby=" + Arrays.toString(Hobby) +
                '}';
    }

    private String Email;
    private String Password;
    private Byte Gender;

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Byte getGender() {
        return Gender;
    }

    public void setGender(Byte gender) {
        Gender = gender;
    }

    public String[] getHobby() {
        return Hobby;
    }

    public void setHobby(String[] hobby) {
        Hobby = hobby;
    }

    private String[] Hobby;

    }