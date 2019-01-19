package pajeObject;

import org.testng.annotations.Test;
import pages.OrangeLoginPage;
import utlities.Config;
import utlities.Driver;

public class OrangeTest {


   @Test
   public void negativeLogin(){
       Driver.getDriver().get(Config.getProperty("url"));
       OrangeLoginPage olp = new OrangeLoginPage();
       olp.logIn(Config.getProperty("username"), Config.getProperty("password"));


   }


}
