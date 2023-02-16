package com.resolver.qa.pageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.resolver.qa.base.BaseTest.scroll;

public class PageFactory_Test1  {

    WebDriver driver;


    public PageFactory_Test1(WebDriver driver) {
        this.driver = driver;
        scroll(test1Div);

    }

    By test1Div = By.xpath("//div[@id='test-1-div']");
    By emailField = By.id("inputEmail");
    By passwordField = By.id("inputPassword");
    By signIn = By.xpath("//button[@class='btn btn-lg btn-primary btn-block' and @type='submit']");


    public void enterEmail (String emailId){
        driver.findElement(emailField).sendKeys(emailId);
    }

    public void enterPwd (String pwd){
        driver.findElement(passwordField).sendKeys((pwd));
    }

    public void submit(){
        driver.findElement(signIn).click();
    }

    public void checkElements (String element){
        switch (element.toLowerCase()){
            case "email":
                assert driver.findElement(emailField).isDisplayed();
                break;
            case "password":
                assert driver.findElement(passwordField).isDisplayed();
                break;
            case "signin":
                assert driver.findElement(signIn).isDisplayed();

        }
    }


}
