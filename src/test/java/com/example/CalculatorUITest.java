package com.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class CalculatorUITest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testAddition() {
        driver.get("http://localhost:8080/web-calculator/");
        // Your Selenium UI test code goes here
    }

    // Add more test methods for other calculator operations

}
