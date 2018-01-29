package com.technosoft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

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