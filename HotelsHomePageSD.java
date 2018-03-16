package stepdefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.ExpediaHomePage;
import framework.HotelsHomePage;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by igorsandler on 2/16/18.
 */
public class HotelsHomePageSD {
    private HotelsHomePage hotelsHomePage = new HotelsHomePage();
    @Given("^I am on home page of Hotels$")
    public void amIOnHotelsHomePage() {
        String expectedResults = "Hotels.com - Cheap Hotels, Discount Rates & Hotel Deals";
        String actualResults = SharedSD.getDriver().getTitle();
        Assert.assertEquals(expectedResults,actualResults);
    }
//    @When("^I click Where to box$")
//    public void clickWhereBox() {
//        hotelsHomePage.clickWhereBox();
//
//    }
    @When("^I enter Paris in Where To box$")
    public void enterPlace() throws InterruptedException {
    
        hotelsHomePage.enterText();
    }

    @When("^I click Check in box$")
    public void clickDatebox() throws InterruptedException {
        hotelsHomePage.setDate();
    }

    @When("^I click Search button$")
    public void clickSearchButton() throws InterruptedException {
        hotelsHomePage.clickSearchButton();
    }

    @Then("^I see Paris, France selected$")
    public void verifyDestination() {
        hotelsHomePage.verifySelection();
    }


    @Then("^I'm on Paris, France destination page$")
    public void verifyPage() {
        String expecteddTest = "Hotels.com - hotels in Paris, France";
        String actualTest = SharedSD.getDriver().getTitle();
        Assert.assertEquals(actualTest,expecteddTest);
    }

}
