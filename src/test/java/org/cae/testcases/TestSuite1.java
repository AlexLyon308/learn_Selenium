package org.cae.testcases;

import org.cae.pages.SignInPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestSuite1 {
    WebDriver driver = new ChromeDriver();
    SignInPage SignInPage = new SignInPage();


    String baseUrl = "https://tmds-master.dev.pelesys.com/GC/Account/Login";
    String driverPath = ".\\resources\\drivers\\chromedriver.exe";


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver.manage().window().maximize();

    }

    @Test(description = "When user enters TMDS website, user can see TMDS homepage title")
    public void verifyHomepageTitle() throws InterruptedException {

        driver.get("https://tmds-master.dev.pelesys.com/GC/Account/Login");

        String expectedTitle = "Log in - Pelesys TMDS";
        String actualTitle = driver.getTitle();

        System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test(description = "When user click at /'Language/' button, user can see a popup screen to select language")
    public void verifySelectLanguageButton() throws InterruptedException {


        Assert.assertNotNull(SignInPage.SelectLanguageButton);

        driver.findElement(SignInPage.SelectLanguageButton).click();

        Assert.assertNotNull(SignInPage.SelectLanguageHeader);
        driver.findElement(SignInPage.SelectLanguageCloseButton).click();
    }

    @Test(description = "When user click at x button, /'Select language/' screen will close ")
    public void verifySelectLanguageCloseButton() throws InterruptedException {

        driver.findElement(SignInPage.SelectLanguageButton).click();
        Assert.assertNotNull(SignInPage.SelectLanguageCloseButton);
        driver.findElement(SignInPage.SelectLanguageCloseButton).click();
        //Assert.assertNull(SignInPage.SelectLanguageHeader);

    }



    /*

@Test(description="When user click at /'Log in with my Pelesys Account/', user can see login screen for Pelesys Account")
public void verifyLoginFeature() throws InterruptedException {

    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(SignInPage.PelesysLoginButton).click();
    Assert.assertNotNull(SignInPage.SupportContactMessage, "Support contact message should exist here, but it doesn't.");
}

*/


/*
@AfterClass
    public void afterTest() {
    driver.quit();
}
*/


}