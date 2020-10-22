package com.xlschool.framework.utils;

import com.xlschool.framework.driver.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class Utils {
    public static void pauseDriver() {
        int waitTime = 500;
        try {
            Thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    public static void highlighElement(WebElement pWebElement) {
        JavascriptExecutor jse = (JavascriptExecutor) DriverHandler.getDriver();
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", pWebElement);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) DriverHandler.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //sacar el driver del metodo (y tambien en practiceforms)

    public static void validationFormInformation(String j, WebDriver driver, String s) {
        String allFormsSuccessName = driver.findElement(By.xpath(s)).getText();
        assertTrue(allFormsSuccessName.contains(j));
    }
}
