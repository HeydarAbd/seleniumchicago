package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHomePage;
import pages.OrangeLoginPage;
import utlities.Config;
import utlities.Driver;
import utlities.TestBase;

import java.util.List;

public class OrangeAdmin extends TestBase {




    @Test
    public void aloginVerification() throws InterruptedException {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(2000);
        OrangeLoginPage olp = new OrangeLoginPage();
        olp.logIn(Config.getProperty("username"), Config.getProperty("password"));


        OrangeHomePage ohp = new OrangeHomePage(Driver.getDriver());
        Assert.assertTrue(ohp.welcomeAdmin.isDisplayed());
        Thread.sleep(2000);
        ohp.welcomeAdmin.click();
        ohp.aboutLink.click();
        Assert.assertTrue(ohp.companyInfo.getText().contains("OrangeHRM"));
    }



    @Test
    public void jobTitleVerification() throws InterruptedException {

        Driver.getDriver().get(Config.getProperty("url"));
        Thread.sleep(2000);
        OrangeLoginPage olp = new OrangeLoginPage();
        olp.logIn(Config.getProperty("username"), Config.getProperty("password"));

        OrangeHomePage ohp = new OrangeHomePage(Driver.getDriver());
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(ohp.performace).perform();
        actions.moveToElement(ohp.configure).perform();
         ohp.kpis.click();

        Select jobTitle = new Select(ohp.jobTitleDropdown);
        List<WebElement> allOptions = jobTitle.getOptions();
        boolean found = false;
        for (WebElement option : allOptions){
            System.out.println(option.getText());
            if (option.getText().equals("CEO")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);





    }








}
