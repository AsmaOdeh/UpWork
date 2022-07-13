package com.upwork.methods;

import com.upwork.pages.LogoDesignPageElements;
import com.upwork.pages.ServicesPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class LogoDesignPageMethods extends LogoDesignPageElements {


    public LogoDesignPageMethods() throws IOException {
        super();
    }

    public void clickOnSearchProjects(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search projects']")));
        searchProjectsInputField.click();
    }

    public void typeKeyword (String keyword){

        searchProjectsInputField.sendKeys(keyword);
    }

    public List<WebElement> parseTheResults (){

        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='list-item d-flex col-xs-12 col-md-6 col-lg-4 col-xl-3']//descendant::h3[@class='project-tile__title mb-0 flex-1 project-tile__title-link']//strong"));
        return  searchResults;


    }


}
