package com.technosoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * Created by igorsandler on 1/13/18.
 */
public class DriverWrapper {
    private static WebDriver driver = null;
    private static WebDriver firefoxDriver = null;
    private static WebDriver safariDriver = null;
    private static String url = "https://www.facebook.com/";


    public static WebDriver getDriver() {
        return driver;
    }
    public static WebDriver getFirefoxDriver() {
        return firefoxDriver;
    }
    public static WebDriver getSafariDriver() {
        return safariDriver;
    }


    @BeforeClass
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/igorsandler/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);


    }
    @BeforeClass

    public void initializeSafariDriver() {
        System.setProperty("webdriver.safari.driver","/Users/igorsandler/Downloads/SafariDriver.safariextz");
        safariDriver = new SafariDriver();
        safariDriver.navigate().to(url);
    }
    @BeforeClass

    public void initializeFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/igorsandler/Desktop/geckodriver");

        firefoxDriver = new FirefoxDriver();

        firefoxDriver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        safariDriver.quit();
        firefoxDriver.quit();
    }

}
