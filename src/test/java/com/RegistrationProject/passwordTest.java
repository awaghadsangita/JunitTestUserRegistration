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
                //UC_6
/*
                { "sangita",false},
                {"sangita123",true},
                {"Sangita123",true},
                {"SANGITA123",true} */
                //UC_7
/*                { "sangita",false},
                {"sangita123",false},
                {"Sangita123",true},
                {"SANGITA123",true},
                {"123sangitaaa",false},
                {"123SangitaA",true},*/
                //UC_8
                {"sangeetAaa",false},
                {"sangeetaaa",false},
                {"Sangita",false},
                {"sangita123",false},
                {"sangitaAAA",false},
                {"SangitaA123",true},
                {"Sangita123",true},
                {"12Sangita",true},
                {"sangita1A",true}
        };

        return Arrays.asList(data);
    }

    @Test
    public void Test()
    {
        Boolean result =userValidator.validatePassword(this.password);
        Assert.assertEquals(this.expectedValidation,result);
    }
}
