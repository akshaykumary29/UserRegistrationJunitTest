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
        try {
            boolean result = userRegistration.firstName("Akshay");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        try {
            boolean result = userRegistration.firstName("akshay");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        try {
            boolean result = userRegistration.lastName("Patil");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        try {
            boolean result = userRegistration.lastName("patil123");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailWhenProperShouldReturnTrue() {
        try {
            boolean result = userRegistration.email("patil@123gmail.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailWhenNotProperShouldReturnFalse() {
        try {
            boolean result = userRegistration.email("patil()#@gamil.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.mobileNumber("91 9876543210");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.mobileNumber("91 19876543210");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.password("Abcde@12345");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.password("abc@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule2("abCde@12345");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule2("abc@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordAtleastOneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule3("abCde1234");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordAtleastOneNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule3("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule4("abCde@xyz123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule4("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() throws MoodAnalyzerException {
        try {
            String result = MoodAnalyser.analyserMood("User is Happy");
            Assert.assertEquals("Entry Successfully", result);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnEntryFailed() throws MoodAnalyzerException {
        try {
            String result = MoodAnalyser.analyserMood("User is Sad");
            Assert.assertEquals("Entry Failed", result);
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
        }
    }
}
