package com.RegistrationProject;

import java.util.regex.Pattern;

public class UserValidator {

    public Boolean validateFirstName(String fname) {
        return Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(fname).matches();
    }

}
