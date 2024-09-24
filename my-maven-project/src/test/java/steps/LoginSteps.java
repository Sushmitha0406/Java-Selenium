package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    WebDriver driver;
    WebDriverWait wait;
@Given("User navigate to the orangehrm application login")
    public void userNavigateToTheOrangehrmApplicationLogin() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }
@Given("User enter the username as Admin")
    public void userEnterTheUsernameAsAdmin() {
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        System.out.println("Entering username: Admin");
}
// @Given("User enter the password as admin123")
//     public void userEnterThePasswordAsAdmin123() {
//         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//         System.out.println("Entering password: admin123");
// }
@When("User clicks on Login button")
    public void userClicksOnLoginButton() {
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        System.out.println("Clicking on Login button");
}
@Then("Login should be success")
    public void loginShouldBeSuccess() {
        String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        System.out.println(text);
        driver.quit();
}
@When("Login should not be success")
public void loginShouldNotBeSuccess() {
    String text1 = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
    // Assert.assertEquals(text1, "Invalid credentials");
    System.out.println(text1);
    driver.quit();
}
@Given("User enter the password as {string}")
public void userEnterThePasswordAs(String password) {
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    System.out.println("Entering password: admin123");
}
}