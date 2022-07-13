package com.upwork.methods;

import com.upwork.pages.HomePageElements;
import com.upwork.pages.ServicesPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class ServicesPageMethods extends ServicesPageElements {


    public ServicesPageMethods() throws IOException {
        super();
    }

    public void clickOnLogoDesign(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='badge flex-none mr-5 mt-10'][contains(@href,'services/logo-design')]")));
        logoDesign.click();
    }


}
