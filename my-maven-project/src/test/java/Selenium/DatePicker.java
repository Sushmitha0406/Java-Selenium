package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", "C://ChromeDriver_test//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.]")).click();
        driver.findElement(By.className("f73e6603bf")).click();
        driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
        System.out.println(driver.getTitle());
        // driver.wait(5000);
        driver.close();
    }

}
