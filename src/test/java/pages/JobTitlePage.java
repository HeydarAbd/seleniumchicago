package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utlities.Driver;

public class JobTitlePage {

    private WebDriver driver;

    public JobTitlePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }










}
