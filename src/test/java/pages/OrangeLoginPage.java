package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utlities.Driver;

public class OrangeLoginPage {

    WebDriver driver;

    public OrangeLoginPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;



    public void logIn(String usernameText, String passwordText){
        userName.sendKeys(usernameText);
        password.sendKeys(passwordText);
        loginBtn.click();
    }





}
