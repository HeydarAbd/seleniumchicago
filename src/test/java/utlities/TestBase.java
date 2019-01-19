package utlities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {



       // public static WebDriver driver;
        public static Faker faker;
        Random random = new Random();
        Actions actions;


        @BeforeClass
        public void setUp(){
            WebDriverManager.chromedriver().setup();
        }



        @BeforeMethod
        public void startTest(){
           // driver = new ChromeDriver();
            faker = new Faker();
           // driver.manage().window().maximize();
          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            actions = new Actions(Driver.getDriver());

        }


        @AfterMethod
        public void cleaning(){
            //Driver.closeDriver();

        }





    }


