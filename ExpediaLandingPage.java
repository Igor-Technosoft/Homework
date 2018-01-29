package com.technosoft.selenium;

import org.openqa.selenium.By;

/**
 * Created by igorsandler on 1/28/18.
 */
public class ExpediaLandingPage extends ExpediaBasePage {

    private By flightsButton = By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[1]");
    private By flyingFromTextBox = By.xpath("//*[@id=\"flight-origin-hp-flight\"]");



    public void clickonFlightsButton() {
       clickFunctionButton(flightsButton);
    }
    public void enterTextSearch(String typeAhead)  {
        testAutoComplete(typeAhead,flyingFromTextBox);
    }
}
