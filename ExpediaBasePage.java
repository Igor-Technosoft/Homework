package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by igorsandler on 1/28/18.
 */
public class ExpediaBasePage extends DriverWrapper{

    public void clickFunctionButton(By locator) {
       // DriverWrapper.getDriver().findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[1]")).click();
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void testAutoComplete(String value, By locator) {
        try {

           // DriverWrapper.getDriver().findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys
            // ("Paris");
            DriverWrapper.getDriver().findElement(locator).sendKeys("Paris");
            Thread.sleep(3000);
            List<WebElement> list = DriverWrapper.getDriver().findElements(By.className("results-item"));
            for (WebElement element: list) {
                if (element.getText().contains("Paris")) {
                    element.click();
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
