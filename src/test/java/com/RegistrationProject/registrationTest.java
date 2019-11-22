package com.RegistrationProject;

import org.junit.Assert;
import org.junit.Test;

public class registrationTest {
    @Test
    public void giveFirstname_WhenProper_ShouldReturnTrue(){
        UserValidator firstNameValidator = new UserValidator();
        Boolean result=firstNameValidator.validateFirstName("Sangeeta");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstname_WhenLessThanThree_ShouldReturnTrue(){
        UserValidator firstNameValidator = new UserValidator();
        Boolean result = firstNameValidator.validateFirstName("sang");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstname_WhenFirstLetterNotCapital_ShouldReturnFalse(){
        UserValidator firstNameValidator = new UserValidator();
        Boolean result = firstNameValidator.validateFirstName("sangeeta");
        Assert.assertFalse(result);
    }
}
