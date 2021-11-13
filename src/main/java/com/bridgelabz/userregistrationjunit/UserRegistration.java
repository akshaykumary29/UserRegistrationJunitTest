package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User Registration Junit Testing
 *
 * @author : Akshay
 * @version : 1.8
 * @since : 09/11/2021
 */
public class UserRegistration {
    public boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean email(String email) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean mobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean password(String password) {
        String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean passwordRule2(String passwordRule2) {
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";  //(?=.*[a-z])(?=.*[A-Z]).{8,40}
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem Using Junit Testing.");
    }
}
