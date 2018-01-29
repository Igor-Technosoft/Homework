package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by igorsandler on 1/28/18.
 */
public class AlertExamples extends DriverWrapper{
    @Test
    public static void alertHandles() throws InterruptedException{
        DriverWrapper.getDriver().switchTo().frame("iframeResult");
        Thread.sleep(2000);
        DriverWrapper.getDriver().findElement(By.xpath("html/body/button")).click();
        Thread.sleep(2000);
        DriverWrapper.getDriver().switchTo().alert().accept();
        Thread.sleep(2000);
        DriverWrapper.getDriver().findElement(By.xpath("html/body/button")).click();
        Thread.sleep(2000);
        DriverWrapper.getDriver().switchTo().alert().dismiss();
        DriverWrapper.getDriver().findElement(By.xpath("html/body/button")).click();
        Thread.sleep(2000);
        DriverWrapper.getDriver().switchTo().alert().getText();
        DriverWrapper.getDriver().switchTo().alert().dismiss();
        Thread.sleep(2000);
    }
}
