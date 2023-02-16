package com.resolver.qa.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.resolver.qa.base.BaseTest.scroll;
import static com.resolver.qa.base.BaseTest.waitForElement;

public class PageFactory_Test5 {

    WebDriver driver;
    public PageFactory_Test5(WebDriver driver) {
        this.driver = driver;
        scroll(test5Div);
    }

    By test5Div = By.xpath("//div[@id='test-5-div']");

    By testButton = By.xpath("//div[@id='test-5-div']//button");
    By alertMsg = By.xpath("//div[@id='test-5-div']//div[@id='test5-alert']");

    public Boolean isTestButtonDisplayed(){

        waitForElement(testButton);
        return driver.findElement(testButton).isDisplayed();

    }
    public Boolean isSuccessMsgDisplayed(){
        driver.findElement(testButton).click();
        return driver.findElement(alertMsg).isDisplayed();
    }

    public Boolean isTestButtonDisabled(){
        return driver.findElement(testButton).isEnabled();
    }
}
