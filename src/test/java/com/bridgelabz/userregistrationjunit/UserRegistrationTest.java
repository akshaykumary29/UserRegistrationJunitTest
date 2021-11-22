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
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateFirstName.validate("Akshay");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateFirstName.validate("akshay");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateFirstName.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateLastName.validate("Patil");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateLastName.validate("patil123");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_null_ShouldThrowUserRegistraationException() {
        try {
            userRegistration.validateLastName.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateLastName.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateEmail.validate("patil@123gmail.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailWhenNotProperShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateEmail.validate("patil()#@gamil.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateEmail.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.validateEmail.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validateMobileNumber.validate("91 9876543210");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validateMobileNumber.validate("91 19876543210");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateMobileNumber.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validateMobileNumber.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("Abcde@12345");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("abc@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("abCde@12345");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("abc@");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("123Aa@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.validatePassword.validate("abCde@xyz123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NULL, UserRegistrationException.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.validatePassword.validate("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EMPTY, UserRegistrationException.type);
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

    @Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyzerException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyserMood(null);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.type.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyzerException() throws MoodAnalyzerException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyserMood("");
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY, MoodAnalyzerException.type);
        }
    }
}
