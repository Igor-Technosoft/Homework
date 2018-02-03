package com.technosoft.selenium;
import org.openqa.selenium.*;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Arrays;

/**
 * Created by igorsandler on 2/3/18.
 */
public class GetElements {


    public void getElements(By locator) {
        List<WebElement> list = DriverWrapper.getDriver().findElements(By.className("itemContent"));

        for (int i = 0; i < list.size(); i++) {

            String getThirdElement = list.get(2).getText();
            String getFifthElement = list.get(4).getText();

            //to print directly
            System.out.println(getThirdElement + "\n");
            System.out.println(getFifthElement + "\n");


        }
    }

    public void getAllValues(By locator) {
        List<WebElement> list = DriverWrapper.getDriver().findElements(By.className("itemContent"));
        for (WebElement element : list) {
            System.out.println(element.getText() + "\n"); 

        }
    }
    public void useMap() {

        HashMap<Integer, ArrayList<WebElement>>listHashMap = new HashMap<Integer, ArrayList<WebElement>>();
        ArrayList list = new ArrayList();
        try (BufferedReader br = new BufferedReader(
                new FileReader("food.txt"));)
        {
            String line;
            while ((line=br.readLine())!=null)
                list.add(Arrays.asList(line.split("/t")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(list);


    }

}