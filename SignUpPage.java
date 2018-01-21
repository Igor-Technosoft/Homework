package com.technosoft.selenium;

import org.openqa.selenium.By;

/**
 * Created by igorsandler on 1/19/18.
 */
public class SignUpPage extends BasePage {
    //Locators
    private By firstNameTextField = By.xpath("//*[@id=\"u_0_m\"]");
    private By lastNameTextField = By.xpath("//*[@id=\"u_0_o\"]");
    private By phoneNumberTextField = By.xpath("//*[@id=\"u_0_r\"]");
    private By createAccountButton = By.xpath("//*[@id=\"u_0_14\"]");
    private By newPasswordTextField = By.xpath("//*[@id=\"u_0_y\"]");
    private By genderRadioButton = By.xpath("//*[@id=\"u_0_d\"]");

public void enterFirstName (String firstName) {
    setValueToInputField(firstName,firstNameTextField);
}

public void enterLastName (String lastName) {
    setValueToInputField(lastName,lastNameTextField);

}
public void enterPhoneNumber (String phoneNumber) {
    setValueToInputField(phoneNumber, phoneNumberTextField);
}

public void enterNewPassword (String newPassword) {
    setValueToInputField(newPassword,newPasswordTextField);
}
public void selectGenderButton () {
    clickOn(genderRadioButton);
}
public void clickCreateButton() {
    clickOn(createAccountButton);
}


}
