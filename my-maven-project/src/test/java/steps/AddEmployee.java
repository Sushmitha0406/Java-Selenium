package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee {

WebDriver driver;
@Given("User navigate to the orangehrm application")
    public void userNavigateToTheOrangehrmApplication() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }
@Given("user login to the application with {string} and {string}")
public void userLoginToTheApplicationWithAnd(String username, String password) {
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
}
@Given("User navigate to the PIM and Add Employee page")
public void userNavigateToThePIMAndAddEmployeePage() {
   driver.findElement(By.xpath("//span[text()='PIM']")).click();
   driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
}
@Given("User enter employee details with {string} and {string}")
public void userEnterEmployeeDetailsWithAnd(String firstname, String lastname) {
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);    
}
@When("User clicks on save button")
public void userClicksOnSaveButton() {
    driver.findElement(By.xpath("//button[text()=' Save ']")).click();    
}
@Then("User should be added successfully")
public void userShouldBeAddedSuccessfully() {
    String success = driver.findElement(By.xpath("//div[@aria-live='assertive']")).getText();
    System.out.println(success);
    driver.quit();
}
}
