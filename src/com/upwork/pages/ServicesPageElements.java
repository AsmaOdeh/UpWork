package com.upwork.pages;

import com.upwork.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesPageElements extends TestBase {

    public ServicesPageElements() throws IOException {

        // Use this instead of repeating this step for each element
        PageFactory.initElements(driver, this);
    }

    // Define the elements inside the home page

    @FindBy (xpath = "//a[@class='badge flex-none mr-5 mt-10'][contains(@href,'services/logo-design')]")
    public WebElement logoDesign;







}
