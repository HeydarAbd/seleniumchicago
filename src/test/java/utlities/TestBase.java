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



        public static Faker faker;
        Random random = new Random();
        Actions actions;


        @BeforeClass
        public void setUp(){
            WebDriverManager.chromedriver().setup();
        }



        @BeforeMethod
        public void startTest(){
            faker = new Faker();
            actions = new Actions(Driver.getDriver());

        }


        @AfterMethod
        public void cleaning(){
            Driver.closeDriver();

        }







    }


