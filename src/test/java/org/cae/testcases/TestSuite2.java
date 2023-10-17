package org.cae.testcases;

import org.cae.pages.BaseSetup;
import org.cae.pages.SignInPage;
import org.cae.pages.SignInPage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.*;



public class TestSuite2 extends BaseSetup {

    private WebDriver driver;
    public SignInPage2 SignInPage;

    @BeforeClass
    public void setUp() {

        driver = getDriver();
        SignInPage = new SignInPage2(driver);
    }

    @Test(description = "When user enters TMDS website, user can see TMDS homepage title")
    public void verifyHomepageTitle() throws InterruptedException {

        driver.get("https://tmds-master.dev.pelesys.com/GC/Account/Login");

        String expectedTitle = "Log in - Pelesys TMDS";
        String actualTitle = driver.getTitle();

        System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(4000);


    }

    @Test(description = "When user click at /'Language/' button, user can see a popup screen to select language")
    public void verifySelectLanguageButton() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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


}
