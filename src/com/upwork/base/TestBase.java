package com.upwork.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static WebDriverWait wait;

    // Constructor
    public TestBase () throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\NewFramwork_UpWork\\src\\com\\upwork\\config\\config.properties");
        prop.load(fis);

        String url = prop.getProperty("URL");
        System.out.println(url);

    }

    public void initialization (){

        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver,20);

        System.getProperty("webdriver.chrome.driver", "C:\\ChromeDriver_upwork\\chromedriver.exe");

        driver.get("http://www.google.com");

        // Maximize the screen
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
