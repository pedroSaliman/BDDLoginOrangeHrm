
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
public class MyStepDefinitions {
    WebDriver driver;
    LoginPage log;
    @Given("user launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @When("user opens url {string}")
    public void user_opens_url(String url) {
        driver.get(url);

    }
    @When("the user enter the username as {string} and password as {string}")
    public void the_user_enter_the_username_as_and_password_as(String username, String password) {
    log=new LoginPage(driver);
    log.setusername(username);
    log.setpassword(password);
    }
    @When("click to login button")
    public void click_to_login_button() {
log=new LoginPage(driver);
log.click();
    }
    @Then("close the browser")
    public void close_the_browser() {
driver.quit();
    }
}
