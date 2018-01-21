package com.technosoft.selenium;
import org.openqa.selenium.By;

/**
 * Created by igorsandler on 1/19/18.
 */
public class LandingPage extends BasePage {
    // Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");


   // private By signUpLink = By.xpath("//table/tbody/tr[1]/td[1]/a");
    private By signUpLink = By.linkText("Sign Up");
    private By maleRadioButton = By.id("u_0_c");

    // Methods
    public void enterEmail(String email) {
        setValueToInputField(email,emailTextField);
    }
    public void enerPassword(String password) {
        setValueToInputField(password, passTextField);

    }
    public boolean verifyDisplayed() {
       genderRadioButtonSelected(maleRadioButton);
       return genderRadioButtonDisplayed(maleRadioButton);
    }

    public boolean vefifyEnabled() {
        genderRadioButtonEnabled(maleRadioButton);
        return genderRadioButtonEnabled(maleRadioButton);
    }


    public void clickRadioButton() {
        clickOn(maleRadioButton);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);

    }


    public void clickSignUpLink() {
        clickOn(signUpLink);
    }
    public void loginToApp(String email, String password) {
        enterEmail(email);
        enterEmail(password);
        clickRadioButton();
        clickOnLoginButton();
        clickSignUpLink();

    }


}
