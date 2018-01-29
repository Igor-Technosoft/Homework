package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by igorsandler on 1/28/18.
 */
public class HotelsBasePage extends DriverWrapper{
    SimpleDateFormat sdf = new SimpleDateFormat("d");
    Date date = new Date();
    String todayDate = sdf.format(date);
    public void setCurrentDate(By locator) {
        try {

           // SimpleDateFormat sdf = new SimpleDateFormat("d");
           // Date date = new Date();
           // String todayDate = sdf.format(date);

           // DriverWrapper.getDriver().findElement(By.xpath("//*[@id=\"qf-0q-localised-check-in\"]")).click();
            DriverWrapper.getDriver().findElement(locator).click();
            List<WebElement> days = DriverWrapper.getDriver().findElements(By.xpath("" +
                    ".//*[@class='widget-datepicker-bd']/descendant::a"));
            for (WebElement day : days) {
                String expectedDay = day.getText();
                if (expectedDay.equals(todayDate)) {
                    day.click();
                    Thread.sleep(3000);
                    break;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
