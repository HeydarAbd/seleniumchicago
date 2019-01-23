package pageObject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class Grey {

    public static void main(String[] args) {
        System.out.println("hello WORLD!");
    }

    @BeforeClass
    public static void setup(){
        System.out.println("JUNIT BEFORE CLASS");
    }


    @Before
    public void b(){
        System.out.println("B Before annotation");
    }


    @Test
    public void test1(){

        System.out.println("Junit test 1");
        Assert.assertEquals("4 and 5 comparison", 4,5);
    }


    @Test
    public void test2(){
        System.out.println("Junit test 2");
    }






}
