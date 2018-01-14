package com.technosoft.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;



/**
 * Created by igorsandler on 1/13/18.
 */
public class SampleTestNGExamplesTest extends DriverWrapper {
// This is from the class lecture

    @Test
    public void verifyURL () {
        String currentURL = getDriver().getCurrentUrl();

        Assert.assertEquals(currentURL,"https://www.facebook.com/","Invalid URL");
    }
    @Test
//    This is to assert that the correct page title was accessed
    public void verifyPageTitle () {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("This is the title of Facebook page from Chrome " + " " + actualTitle);
    }
    @Test
    public void safariVerifyURL () {
        String currentURL = getSafariDriver().getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.facebook.com/","Invalid URL");
    }
    @Test
    public void safariVerifyPageTitle () {
        String actualTitle = getSafariDriver().getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("This is the title of Facebook page from Safari" + " " + actualTitle);

    }

    @Test
    public void firefoxVerifyURL () {
        String currentURL = getFirefoxDriver().getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.facebook.com/","Invalid URL");
    }
    @Test
    public void firefoxVerifyPageTitle () {
        String actualTitle = getDriver().getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("This is the title of Facebook page from Firefox" + " " + actualTitle);
    }
}