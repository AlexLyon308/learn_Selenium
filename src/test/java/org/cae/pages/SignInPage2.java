package org.cae.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignInPage2 {




    // Khởi tạo class khi được gọi và truyền driver vào để các thành phần trong
    // class này đọc

    private WebDriver driver;
    public SignInPage2(WebDriver driver) {
        this.driver = driver;
    }


    //Login Screen elements
    public By PelesysLoginButton = By.xpath("//button[@data-bind='click: SetLoginType.bind(this, GC.Account.Login.Type.PelesysLogin)']");
    public By MyCompanyLoginButton = By.xpath("//span[contains(text(),'Log in with my Company Account')]/parent::button");

    public By PelesysRDLoginButton = By.xpath("//button[contains(text(),'Log in with my Pelesys R&D Account')]");

    public By LoginNameField = By.xpath("//input[@data-bind='textinput: userName']");

    public By PasswordField = By.xpath("//input[@data-bind='textinput: password, hasFocus: isSelected']");

    public By LoginButton = By.xpath("//button[@data-bind='click: Login']");

    public By ForgotPasswordButton = By.xpath("//button[@data-bind='click: ForgotPassword']");

    public By LoginPageTitle = By.xpath("//strong[@data-bind='text: title']");

    public By SupportContactMessage = By.xpath("//p[@data-bind='text: message']");

    public By SelectLanguageButton = By.xpath("//a[@data-bind='click: app.OpenSelectLanguage']");

    //'Select language' screen elements
    public By SelectLanguageHeader = By.xpath("//h4[contains(text(), 'Select Language')]");

    public By EnglishOption = By.xpath("//span[contains(text(), 'English')]");

    public By FrenchOption = By.xpath("//span[contains(text(), 'French')]");

    public By SelectLanguageCloseButton = By.xpath("//button[@aria-label='Close']");

    public By SelectLanguageCancelButton = By.xpath("//button[text()='Cancel']");

}
