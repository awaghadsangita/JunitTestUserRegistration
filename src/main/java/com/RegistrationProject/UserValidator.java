package com.RegistrationProject;

import java.util.regex.Pattern;

public class UserValidator {

    public Boolean validateFirstName(String fname) {
        return Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(fname).matches();
    }

    public Boolean validateLastName(String lname) {
        return Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lname).matches();
    }
    public Boolean validateEmail(String email)
    {
        return Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$").matcher(email).matches();
    }
    public Boolean validateMobileNumber(String ph) {
        return Pattern.compile("^[0-9]{2}[[:space:]]{1}[0-9]{10}$").matcher(ph).matches();
    }
    public Boolean validatePassword(String pwd){
        //========== UC_6 ============
//        String pwdRegex_uc6="^[a-zA-Z0-9]{8,}";
//        Boolean p1=Pattern.compile(pwdRegex1_uc6).matcher(pwd).matches();
        //========== UC_7 ============
        String pwdRegex2_uc7="^(?=.*?[A-Z]).{8,}$";
        Boolean p1=Pattern.compile(pwdRegex2_uc7).matcher(pwd).matches();
        if (p1 ){
            return true;
        }
        else{
            return false;
        }
    }


}
