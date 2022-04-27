package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By username= By.id("txtUsername");
    private By pass= By.id("txtPassword");
    private By logbtn= By.id("btnLogin");

    public void setusername(String theusername)
    {
        driver.findElement(username).sendKeys(theusername);
    }
    public void setpassword(String password)
    {
        driver.findElement(pass).sendKeys(password);
    }
    public void click(){
        driver.findElement(logbtn).click();
    }





}
