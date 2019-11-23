package com.RegistrationProject;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class passwordTest {
    private String password;
    private static UserValidator userValidator;
    private boolean expectedValidation;

    public passwordTest(String password, boolean expectedValidation)
    {
        this.password = password;
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
                { "sangita" , false },
                {"sangita123",true},
                {"Sangita123",true}};

        return Arrays.asList(data);
    }

    @Test
    public void Test()
    {
        Boolean result =userValidator.validatePassword(this.password);
        Assert.assertEquals(this.expectedValidation,result);
    }
}
