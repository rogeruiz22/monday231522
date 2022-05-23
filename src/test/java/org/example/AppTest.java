package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Login | Salesforce", "Not getting the page to load");

        driver.quit();
    }
}
