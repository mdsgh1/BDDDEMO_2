package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExampleSteps {

    private WebDriver driver;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        System.out.println("User is on home page");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }
    @When("User navigates to login page")
    public void user_navigates_to_login_page() {
        System.out.println("User navigates to login page");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("Username is " + username + "Password is " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }
    @Then("Message displayed login succesfully")
    public void message_displayed_login_succesfully() throws Throwable {
        System.out.println("Message displayed login succesfully");
        Thread.sleep(2000);
        driver.close();
    }
}
