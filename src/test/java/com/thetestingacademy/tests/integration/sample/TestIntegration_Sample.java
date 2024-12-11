package com.thetestingacademy.tests.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegration_Sample {
    //create a booking, create a token
    // get booking
    // update the booking
    //delete the booking

    @Test(groups = "qa", priority = 1)
    @Owner("Ramya")
    @Description("TC#INT1 : Step 1. Verify that booking can be created")
    public void testcreatebooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 2)
    @Owner("Ramya")
    @Description("TC#INT2 : Step 2. Verify that by Booking Id")
    public void testverifybooking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 3)
    @Owner("Ramya")
    @Description("TC#INT3 : Step 3 . Verify Updated Booking by ID")
    public void testupdatebooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 4)
    @Owner("Ramya")
    @Description("TC#INT4 : Step 4. Delete the Booking by ID")
    public void testdeletebooking(){
        Assert.assertTrue(true);
        Assert.assertTrue(true);


    }




}
