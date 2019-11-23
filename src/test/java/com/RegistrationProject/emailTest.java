package com.RegistrationProject;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class emailTest {
    private String email;
    private static UserValidator userValidator;
    private boolean expectedValidation;

    public emailTest(String email, boolean expectedValidation)
    {
        this.email = email;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize()
    {
            userValidator =new UserValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][] {
                { "abc@yahoo.com" , true },
                {"abc.100@yahoo.com",true},
                {"abc.100@abc.com.au",true},
                {"abc+100@gmail.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false}};

        return Arrays.asList(data);
    }

    @Test
    public void Test()
    {
        Boolean result =userValidator.validateEmail(this.email);
        Assert.assertEquals(this.expectedValidation,result);
    }
}
