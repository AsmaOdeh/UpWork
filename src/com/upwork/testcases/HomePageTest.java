package com.upwork.testcases;

import com.upwork.base.TestBase;
import com.upwork.methods.HomePageMethods;
import com.upwork.pages.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class HomePageTest extends TestBase {

    HomePageMethods homePageMethods = new HomePageMethods();


    public HomePageTest() throws IOException {

        // Call the constructor from the parent class (TestBase)
        super();
    }

    @BeforeClass
    public void beforeClass (){
        System.out.println("Hi! Before Class ");
    }

    @BeforeMethod
    public void  beforeMethod (){

        // This will open the browser and enter the URL
        initialization();
    }

    @Test
    public void homePageTest() throws InterruptedException {

        String searchKeyWord = "Automation";

        homePageMethods.clickOnSearchDropDown();
        homePageMethods.clickOnTalent();
        homePageMethods.typeSearchKeyword(searchKeyWord);


    }

    /*//@AfterMethod
    public void afterMethod (){
        driver.quit();
    }*/


    //@AfterClass
    public void afterClass (){
        System.out.println("Hi! After Class ");
    }
}
