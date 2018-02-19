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
    private By genderRadioButton = By.id("u_0_9");
  private By monthDropdownField = By.id("month");
  private By dayDropDownField = By.id("day");
  private By yearDropDownField = By.id("year");
  private String monthValue = "Month";
  private String dayValue = "Day";
  private String yearValue = "Year";


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
// Click Radio Button
public void selectGenderButton () {
    clickOn(genderRadioButton);
}

  //  public void chooseMonthDropDown()  {
   //     selectMonthFromDropDown(monthDropdownField);

   // }

    // Method Overloading
   public void chooseDifferentMonthDropDown() {
        selectMonthFromDropDown(monthDropdownField,monthValue);
   }



    //public void chooseDayDropDown() {
     //   selectDayFromDropDown(dayDropDownField);
    //}

    // Method Overloading
    public void chooseDifferentDayDropDown() {
        selectDayFromDropDown(dayDropDownField,dayValue);
    }

    //public void chooseYearDropDown() {
     //   selectYearDropDown(yearDropDownField);
    //}

    //Method Overloading
    public void chooseDifferentYearDropDown() {
        selectYearDropDown(yearDropDownField,yearValue);
    }



public void clickCreateButton() {
   // chooseMonthDropDown();
   // chooseDayDropDown();
   // chooseYearDropDown();
    chooseDifferentMonthDropDown();
    chooseDifferentDayDropDown();
    chooseDifferentYearDropDown();
    clickOn(createAccountButton);
}


}

