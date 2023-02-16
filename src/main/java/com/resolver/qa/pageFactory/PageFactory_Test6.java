package com.resolver.qa.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.resolver.qa.base.BaseTest.scroll;

public class PageFactory_Test6 {

    WebDriver driver;
    public PageFactory_Test6(WebDriver driver) {
        this.driver = driver;
        scroll(test6Div);
    }

    By test6Div = By.xpath("//div[@id='test-6-div']");
    By grid = By.xpath("//div[@id='test-6-div']//table");

    public String getCellValue(int c1, int c2){

        WebElement table = driver.findElement(grid);
        int rowId = c1 + 1;
        int columnId = c2 + 1;
        WebElement cell = table.findElement(By.xpath("//div[@id='test-6-div']//table/tbody//tr[" + rowId + "]/td["+columnId+"]"));
        return cell.getText();
    }

}
