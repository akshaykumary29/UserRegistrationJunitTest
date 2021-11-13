package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User Registration Junit Testing
 *
 * @author : Akshay
 * @version : 1.8
 * @since : 09/11/2021
 *
 */
public class UserRegistration {
    public boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem Using Junit Testing.");
    }
}
