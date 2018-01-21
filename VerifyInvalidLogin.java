package com.technosoft.selenium;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        landingPage.loginToApp("test@test.com", "12345");

        Assert.assertEquals(loginPage.getRecoverAccountLinkText(), "Recover Your Account");
    }

    @Test
    // This test is to test clicking on the Sign Up link and filling out the Sign Up page
    public void createNewAccount() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignUpLink();
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL, "https://www.facebook.com/r.php", "Invalid URL");
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.enterFirstName("Pete");
        signUpPage.enterLastName("Jones");
        signUpPage.enterPhoneNumber("7187347736");
        signUpPage.enterNewPassword("testing12345!");
        signUpPage.selectGenderButton();
        signUpPage.clickCreateButton();

    }

   @Test
    // This test is to test whether the "Male" Radio Button is displayed on the page, then if it's enabled, and
   // finally selected. If it wasn't selected, it'll be selected.

   public void checkRadioButton() {
   LandingPage landingPage = new LandingPage();
  boolean isDisplayed = landingPage.verifyDisplayed();
  if (isDisplayed) {

      System.out.println("Button is Displayed. Let's continue");
  } else {
      System.out.println("Can't proceed. Radio button not dispalayed");
  }

       boolean isEnabled = landingPage.vefifyEnabled();

    if (isEnabled) {
        System.out.println("This button is enabled");
    } else {
        System.out.println("Can't proceed. Button not enabled");
    }

    boolean isMaleRadioButtonSelected = getDriver().findElement(By.id("u_0_c")).isSelected();
    if (isMaleRadioButtonSelected) {
        System.out.println("Button already selected");

   } else {
        System.out.println("Will click the button");
        landingPage.clickRadioButton();
        isMaleRadioButtonSelected = true;
        Assert.assertEquals(isMaleRadioButtonSelected,true);
    }


    }
    @Test
    // Test using id locator
    public void useDifferentLocators() {
        LandingPage landingPage = new LandingPage();
    WebElement id = getDriver().findElement(By.id("email"));
        System.out.println("This test uses ID Locator" + id + "\n");
        WebElement name = getDriver().findElement(By.name("firstname"));
        System.out.println("This test uses Name Locator " + name + "\n");
        WebElement className = getDriver().findElement(By.className("inputtext"));
        System.out.println("This test uses Class locator " + className + "\n");
        WebElement link = getDriver().findElement(By.linkText("Sign Up"));
        System.out.println("This test uses Link Text Locator " + link   + "\n");
        WebElement xpath = getDriver().findElement(By.xpath("//*[@id=\"u_0_j\"]"));
        System.out.println("This test uses XPath Locator " + xpath + "\n");
        WebElement css = getDriver().findElement(By.cssSelector("#u_0_g"));
        System.out.println("This test uses CSS LOcator " + css + "\n");
        WebElement partialText = getDriver().findElement(By.partialLinkText("Sign"));
        System.out.println("This test uses Partial Link LOcator " + partialText + "\n");
        WebElement tag = getDriver().findElement(By.tagName("input"));
        System.out.println("This test uses Tag " + tag + "\n");
        WebElement attribite = getDriver().findElement(By.xpath("//*[@id=\"u_0_w\"]"));
        System.out.println("This test uses XPath Selector with The Attribute Option " + attribite.getAttribute
                ("class"));




    }

   // @Test
    // Test using Name locator
   // public void useNameLocator() {

    //}

}




