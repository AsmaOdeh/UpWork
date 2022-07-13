package com.upwork.methods;

import com.upwork.pages.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class HomePageMethods extends HomePageElements {


    public HomePageMethods() throws IOException {
        super();
    }

    public void clickOnSearchDropDown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-cy*=search-switch-button]")));
        searchDropDown.click();
    }

    public void clickOnTalent(){
        talent.click();
    }

    public void typeSearchKeyword (String keyword){
        searchTextBox.sendKeys(keyword);
    }
}
