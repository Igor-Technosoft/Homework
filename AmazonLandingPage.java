package com.technosoft.selenium;

import org.openqa.selenium.By;

/**
 * Created by igorsandler on 1/27/18.
 */
public class AmazonLandingPage extends BasePage {
    private By emailTextField = By.id("ap_email");
    private By passTextField = By.id("ap_password");
    private By loginButton = By.id("signInSubmit");

    public void enterEmail(String email) {
        setValueToInputField(email,emailTextField);
    }
    public void enterPassword(String password) {
        setValueToInputField(password, passTextField);

    }
    public void loginToAmazonApp(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOn(loginButton);
    }

}
