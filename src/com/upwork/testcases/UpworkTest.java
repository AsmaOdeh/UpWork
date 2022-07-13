package com.upwork.testcases;

import com.upwork.base.TestBase;
import com.upwork.methods.HomePageMethods;
import com.upwork.methods.LogoDesignPageMethods;
import com.upwork.methods.ServicesPageMethods;
import com.upwork.pages.LogoDesignPageElements;
import com.upwork.pages.ServicesPageElements;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;
import java.util.WeakHashMap;

public class UpworkTest extends TestBase {

    SoftAssert softAssert = new SoftAssert();

    ServicesPageMethods servicesPageMethodsObj = new ServicesPageMethods();
    LogoDesignPageMethods logoDesignPageMethodsObj = new LogoDesignPageMethods();


    public UpworkTest() throws IOException {

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

        String searchKeyWord = "pokemon";

        servicesPageMethodsObj.clickOnLogoDesign();
        logoDesignPageMethodsObj.clickOnSearchProjects();
        logoDesignPageMethodsObj.typeKeyword(searchKeyWord);

        List <WebElement> searchResults = logoDesignPageMethodsObj.parseTheResults();
        for (int i = 0; i < 10 ; i++){

            int resultsContainsKeyWord = 0;
            int resultsDontContainKeyWord = 0;

            softAssert.assertTrue(searchResults.contains(searchKeyWord), "Verify that the first 10 results contain the keyword");

            if (searchKeyWord.contains(searchKeyWord)){
                resultsContainsKeyWord++;
            }
            else {
                resultsDontContainKeyWord++;
            }
            System.out.println("The number of results that contains the keyword "+resultsContainsKeyWord);
            System.out.println("The number of results that does not contain the keyword "+resultsDontContainKeyWord);
        }


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
