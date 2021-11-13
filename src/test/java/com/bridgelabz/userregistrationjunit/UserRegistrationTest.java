package com.bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.firstName("Akshay");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.firstName("akshay");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.lastName("Patil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.lastName("patil123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailWhenProperShouldReturnTrue() {
        boolean result = userRegistration.email("patil@123gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.email("patil()#@gamil.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("91 9876543210");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("91 19876543210");
        Assert.assertEquals(false,result);
    }
}
