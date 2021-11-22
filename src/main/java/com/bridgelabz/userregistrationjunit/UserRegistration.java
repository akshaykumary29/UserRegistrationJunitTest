package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User Registration Lambda Expression
 */

@FunctionalInterface
interface UserDetailsValidation {
    public boolean validate(String x) throws UserRegistrationException;
}

public class UserRegistration {
    UserDetailsValidation validateFirstName = firstName -> {
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null ");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    };

    UserDetailsValidation validateLastName = lastName -> {
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }
    };

    UserDetailsValidation validateEmail = email -> {
        if (email == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (email.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    };

    UserDetailsValidation validateMobileNumber = mobileNumber -> {
        if (mobileNumber == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (mobileNumber.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobileNumber);
            return matcher.matches();
        }
    };

    UserDetailsValidation validatePassword = password -> {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    };

    UserDetailsValidation validateEmailId = emailId -> {
        if (emailId == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[a-z]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,]?[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    };
}
