package com.technosoft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igorsandler on 1/19/18.
 */
public class BasePage {

    public void clickOn(By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot");
            Assert.fail("Element not found" + locator.toString());
        }
    }

    public void setValueToInputField(String value, By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).sendKeys(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot");
            Assert.fail("Element not found" + locator.toString());
        }

    }

    public String getTextFromElement(By locator) {

        return DriverWrapper.getDriver().findElement(locator).getText();

    }
public void actionsNavigation() {
        try {
            WebElement element = DriverWrapper.getDriver().findElement(By.xpath("id(\"nav-link-accountList\")"));
    Actions action = new Actions(DriverWrapper.getDriver());
    action.moveToElement(element).build().perform();
    Thread.sleep(2000);
    DriverWrapper.getDriver().findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
    Thread.sleep(2000);
   // DriverWrapper.getDriver().findElement(By.cssSelector("#nav-flyout-ya-signin > a > span\n")
} catch (InterruptedException e) {
            e.printStackTrace();
        }
}



    public void selectMonthFromDropDown(By locator) {
        // try {


        // Select value from drop
        Select monthDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("month")));
        // Select element by visible text
        monthDropDown.selectByVisibleText("Oct");
    }
    // Method Overloading
    public void selectMonthFromDropDown(By locator, String value) {
        Select monthDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("month")));
        monthDropDown.selectByIndex(10);
    }

    public void selectDayFromDropDown (By locator) {
        Select dayDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("day")));
        dayDropDown.selectByVisibleText("30");
    }
    // Method Overloading
    public void selectDayFromDropDown(By locator, String value) {
        Select dayDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("day")));
        dayDropDown.selectByIndex(30);
    }

    public void selectYearDropDown (By locator) {
        Select yearDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("year")));
        yearDropDown.selectByVisibleText("1974");
    }

    // Method Overloading
    public void selectYearDropDown(By locator, String value) {
        Select yearDropDown = new Select(DriverWrapper.getDriver().findElement(By.id("year")));
        yearDropDown.selectByIndex(45);
    }
    public static void switchToWindow(int index) {
        List<String> listofWindows = new ArrayList<>(DriverWrapper.getDriver().getWindowHandles());
        DriverWrapper.getDriver().switchTo().window(listofWindows.get(index));
    }

    public static void switchToRootWindowAndCloseCurrentWindow() {
        List<String> listofWindows = new ArrayList<>(DriverWrapper.getDriver().getWindowHandles());

        for (int i = 1; i < listofWindows.size(); i++) {
            DriverWrapper.getDriver().switchTo().window(listofWindows.get(i));
            DriverWrapper.getDriver().close();
        }
        DriverWrapper.getDriver().switchTo().window(listofWindows.get(0));
    }


// New Locator Methods
    public boolean genderRadioButtonDisplayed(By locator) {

        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    public boolean genderRadioButtonEnabled(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isEnabled();
    }

      public boolean genderRadioButtonSelected (By locator) {
        return  DriverWrapper.getDriver().findElement(locator).isSelected();
      }


}
