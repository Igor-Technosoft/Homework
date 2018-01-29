package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by igorsandler on 1/28/18.
 */
public class RunExpediaPage extends ExpediaLandingPage {
    @Test
    public void getTypeAhead() {
        ExpediaLandingPage expediaLandingPage = new ExpediaLandingPage();

        expediaLandingPage.clickonFlightsButton();
        expediaLandingPage.enterTextSearch("Paris");

    }
}
