package com.bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;
//    @Before
//    public void before() {
//        userRegistration = new UserRegistration();
//    }

    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.firstName("Akshay");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFlase() {
        boolean result = userRegistration.firstName("akshay");
        Assert.assertEquals(false, result);
    }
}
