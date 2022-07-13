package com.upwork.pages;

import com.upwork.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageElements extends TestBase {

    public HomePageElements() throws IOException {

        // Use this instead of repeating this step for each element
        PageFactory.initElements(driver, this);
    }

    // Define the elements inside the home page

    @FindBy (css = "button[data-cy*=search-switch-button]")
    public WebElement searchDropDown;

    @FindBy (xpath = "//span[contains(text(),'Hire professionals and agencies')]")
    public WebElement talent;

    @FindBy (css = "input[data-cy='search-input")
    public WebElement searchTextBox;

    @FindBy (css = "button[type='submit")
    public WebElement search_button;





}
