package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        // driver.wait(5000);
        driver.close();
    }

}
