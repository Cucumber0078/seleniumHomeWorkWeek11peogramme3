package ChromeBroswerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);// Maximise Window
        driver.manage().window().maximize();
        // We give implecit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the tille of the page//
        String title =  driver.getTitle();
        System.out.println("page title is :" + title );
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page source  :"+ driver.getPageSource());
        // Navigate to URL


        // find the email field element
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("ssadfsdfsdf@gmail.com");
        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys("sjdfkasjdf");

        //close the browser
        //driver.quit();

    }}

