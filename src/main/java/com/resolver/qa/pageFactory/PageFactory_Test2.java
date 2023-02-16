package com.resolver.qa.pageFactory;

import com.resolver.qa.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.resolver.qa.base.BaseTest.scroll;

public class PageFactory_Test2 {

    WebDriver driver;
    public PageFactory_Test2(WebDriver driver) {
        this.driver = driver;
        scroll(test2Div);
    }
    By test2Div = By.xpath("//div[@id='test-2-div']");

    public String getItemValue (int position){

        String ItemWithBatchValue = driver.findElement(By.xpath("//ul[@class='list-group']/li["+position+"]")).getText();
        String badgeValue = driver.findElement(By.xpath("//div[@id='test-2-div']/ul/li["+position+"]/span[@class='badge badge-pill badge-primary']")).getText();
        String itemValue = (ItemWithBatchValue.replace(badgeValue,"")).trim();
        System.out.println("value found noq" +itemValue);
        return itemValue;
    }

    public Integer getItemCount (){
        int itemCount = driver.findElements(By.xpath("//div[@id='test-2-div']/ul/li")).size();
        return itemCount;
    }

    public Integer getItemBadgeValue(int position){
        String value = driver.findElement(By.xpath("//div[@id='test-2-div']/ul/li["+position+"]/span[@class='badge badge-pill badge-primary']")).getText();
        return Integer.parseInt(value);

    }


}
