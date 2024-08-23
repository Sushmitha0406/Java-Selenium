package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    driver.get("http://www.google.com");
    String title = driver.getTitle();
    System.out.println(title);

    if(title.equals("Google")){
        System.out.println("correct title");
    }
    else{
        System.out.println("incorrect title");
    }
    System.out.println(driver.getCurrentUrl());
    // System.out.println(driver.getPageSource());
    driver.quit();
}
}
