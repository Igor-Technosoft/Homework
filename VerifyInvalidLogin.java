package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by igorsandler on 1/17/18.
 */
public class VerifyInvalidLogin extends DriverWrapper {
    @Test
    public void verifyLogin() {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        landingPage.loginToApp("test@test.com","12345");

        Assert.assertEquals(loginPage.getRecoverAccountLinkText(),"Recover Your Account");
    }
    @Test
    public void createNewAccount() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignUpLink();
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.facebook.com/r.php","Invalid URL");
        SignUpPage sinUpPage = new SignUpPage();
        sinUpPage.enterFirstName("Pete");
        sinUpPage.enterLastName("Jones");
        sinUpPage.enterPhoneNumber("7187347736" );
        sinUpPage.enterNewPassword("testing12345!");
        sinUpPage.selectGenderButton();
        sinUpPage.clickCreateButton();

    }
}
