package com.technosoft.selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by igorsandler on 1/28/18.
 */
public class RunHotelsPage extends HotelsBasePage {
    @Test

    public void checkinDate() {

        HotelsLandingPage hotelsLandingPage = new HotelsLandingPage();
        hotelsLandingPage.setDate();


    }
}
