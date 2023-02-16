package com.resolver.qa.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.resolver.qa.base.BaseTest.scroll;
import static com.resolver.qa.base.BaseTest.waitForElement;

public class PageFactory_Test3 {

    WebDriver driver;

    public PageFactory_Test3(WebDriver driver) {
        this.driver = driver;
        scroll(test3Div);
    }

    By test3Div = By.xpath("//div[@id='test-3-div']");

    By optionDrpDwnBtn = By.xpath("//div[@id='test-3-div']/descendant::button[@id='dropdownMenuButton']");
    public String selectOption (int choice) throws InterruptedException {
        scroll(test3Div);
        WebElement toggleBtn = driver.findElement(optionDrpDwnBtn);
        toggleBtn.click();
        waitForElement(By.xpath("//div[@id='test-3-div']//a[@class='dropdown-item'][1]"));
        WebElement option = driver.findElement(By.xpath("//div[@id='test-3-div']//a[@class='dropdown-item']["+choice+"]"));
        option.click();
        waitForElement(optionDrpDwnBtn);
        return driver.findElement(optionDrpDwnBtn).getText();
    }
    public String getDefaultValue(){
        //WebElement defaultOpt = dropDown.getFirstSelectedOption();
        return driver.findElement(optionDrpDwnBtn).getText();
    }
}
