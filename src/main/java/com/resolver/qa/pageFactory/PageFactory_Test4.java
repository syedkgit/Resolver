package com.resolver.qa.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.resolver.qa.base.BaseTest.scroll;

public class PageFactory_Test4 {

    WebDriver driver;
    public PageFactory_Test4(WebDriver driver) {
        this.driver = driver;
    }

    By test4Div = By.xpath("//div[@id='test-4-div']");


    public Boolean isButtonEnabled (int btnPosition){
        scroll(test4Div);
        return driver.findElement(By.xpath("//div[@id='test-4-div']//button["+btnPosition+"]")).isEnabled();
    }
}
