package com.upwork.pages;

import com.upwork.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LogoDesignPageElements extends TestBase {

    public LogoDesignPageElements() throws IOException {

        // Use this instead of repeating this step for each element
        PageFactory.initElements(driver, this);
    }

    // Define the elements inside the home page

    @FindBy (xpath = "//input[@placeholder='Search projects']")
    public WebElement searchProjectsInputField;

    @FindBy(xpath = "//div[@class='list-item d-flex col-xs-12 col-md-6 col-lg-4 col-xl-3']//descendant::h3[@class='project-tile__title mb-0 flex-1 project-tile__title-link']//strong")
    public WebElement searchResultsElements;







}
