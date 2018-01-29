package com.technosoft.selenium;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by igorsandler on 1/28/18.
 */
public class HotelsLandingPage extends HotelsBasePage {
//private By datePick = By.xpath("//*[@id=\"qf-0q-localised-check-in\");

    private By checkinField = By.xpath("//*[@id=\"qf-0q-localised-check-in\"]");



    public void setDate() {

        setCurrentDate(checkinField);

    }


}
