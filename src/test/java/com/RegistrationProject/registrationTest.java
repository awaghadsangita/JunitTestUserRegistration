package com.RegistrationProject;

import org.junit.Assert;
import org.junit.Test;

public class registrationTest {
    @Test
    public void giveFirstname_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        Boolean result=validator.validateFirstName("Sangeeta");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstname_WhenLessThanThree_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        Boolean result = validator.validateFirstName("sang");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstname_WhenFirstLetterNotCapital_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        Boolean result = validator.validateFirstName("sangeeta");
        Assert.assertFalse(result);
    }
}
