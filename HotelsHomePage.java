package framework;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by igorsandler on 2/16/18.
 */
public class HotelsHomePage extends BasePage {
    //public String checkDate;
    // public By checkDate = By.xpath("//*[@id=\"qf-0q-localised-check-in\"]");
   // private By checkinField = By.xpath("//*[@id=\"qf-0q-localised-check-in\"]");

    private By checkinField = By.cssSelector("#qf-0q-localised-check-in");
    SimpleDateFormat sdf = new SimpleDateFormat("d");
    Date date = new Date();
    String todayDate = sdf.format(date);
    private By whereBox = By.cssSelector("#qf-0q-destination");
    private By searchBox = By.xpath("//*[@id=\"main-content\"]/main/div[2]/div/div[1]/div/div[1]/div[1]/div/div/" +
            "form/div[5]/button");

    public void setCurrentDate(By locator) {
 

            SharedSD.getDriver().findElement(locator).click();
            List<WebElement> days = SharedSD.getDriver().findElements(By.xpath("" +
                    ".//*[@class='widget-datepicker-bd']/descendant::a"));
            for (WebElement day : days) {
                String expectedDay = day.getText();
                if (expectedDay.equals(todayDate)) {
                    day.click();
                   
                    break;
                }
            }


//        } catch (InterruptedException e) {
//            e.printStackTrace();
      //  }
    }


    public void setDate() {

        setCurrentDate(checkinField);

    }

    

    public void clickWhereBox() {
        try {


            SharedSD.getDriver().findElement(whereBox).click();
        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    public void enterText() throws StaleElementReferenceException {
        try {

            SharedSD.getDriver().findElement(whereBox).sendKeys("Paris, France");
            WebDriverWait wait = new WebDriverWait(SharedSD.getDriver(),30);
            List<WebElement> list = SharedSD.getDriver().findElements(By.className("autosuggest-category-result"));
            for (WebElement element : list) {
                if (element.getText().contains("Paris, France")) {
                    element = wait.until(ExpectedConditions.elementToBeClickable(By.className("autosuggest-category" +
                            "-result")));
                    element.click();
                    break;
                }
            }
        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    public void verifySelection() {
        List<WebElement> list = SharedSD.getDriver().findElements(By.className("autosuggest-category-result"));
        for (WebElement element : list) {
            if (element.getText().contains("Paris")) {
                String actualTest = element.getText();
                String expectedTest = "Paris, France";
                Assert.assertEquals(actualTest, expectedTest);
            }
        }
    }

    public void clickSearchButton() {
        try {


            SharedSD.getDriver().findElement(searchBox).click();

        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }
   public void handleAlert() throws InterruptedException {
     
       SharedSD.getDriver().findElement(By.xpath("//*[@id=\"managed-overlay\"]/button")).click();
      
   }
}




