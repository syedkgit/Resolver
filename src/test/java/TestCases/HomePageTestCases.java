package TestCases;

import com.resolver.qa.base.BaseTest;
import com.resolver.qa.pageFactory.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageTestCases extends BaseTest {

    @Test
    public void qeTest1(){

        PageFactory_Test1 home = new PageFactory_Test1(driver);
        Reporter.log("======Test 1 : Assert that both the email address and password inputs are present as well as the login button======", true);
        home.checkElements("Email");
        home.checkElements("Password");
        home.checkElements("SignIn");


        Reporter.log("======Test 1 : Enter an email address and password combination into the respective fields======", true);
        home.enterEmail("test@gmail.com");
        home.enterPwd("syed");
    }
    @Test
    public void qeTest2(){
        Reporter.log("======Open HomePage======", true);
        PageFactory_Test2 home = new PageFactory_Test2(driver);

        Reporter.log("======Test 2 : In the test 2 div, assert that there are three values in the listgroup======", true);
        int itemCount = home.getItemCount();
        Assert.assertEquals(itemCount,3,"No of values in the listgroup does not equal 3");

        Reporter.log("======Test 2: Assert that the second list item's value is set to List Item 2 ======", true);
        String itemValue2 = home.getItemValue(2);
        Assert.assertEquals(itemValue2,"List Item 2", "Second list item value is not set to 'List Item 2' ");
        Reporter.log("======Test 2: Assert that the second list item's badge value is 6 ======", true);

        int badgeValueItem2 = home.getItemBadgeValue(2);
        Assert.assertEquals(badgeValueItem2,6, "Item 2 badge value does not equal 6");
    }
    @Test
    public void qeTest3() throws InterruptedException {
        Reporter.log("======Open HomePage======", true);
        PageFactory_Test3 home = new PageFactory_Test3(driver);

        Reporter.log("======Test 3 : In the test 3 div, assert that Option 1 is the default selected value======", true);
        String defValue = home.getDefaultValue();
        Assert.assertEquals(defValue,"Option 1", "Default value does not match 'Option 1'");

        Reporter.log("======Select Option 3 from the select list ======", true);
        String selectedVal = home.selectOption(3);
        Assert.assertEquals(selectedVal,"Option 3", "User selection of option 3 does not match with the value displayed");
    }

    @Test
    public void qeTest4() {
        Reporter.log("======Open HomePage======", true);
        PageFactory_Test4 home = new PageFactory_Test4(driver);

        Reporter.log("======Test 4 : Assert that the first button is enabled and that the second button is disabled======", true);
        boolean isBtn1Enabled = home.isButtonEnabled(1);
        Assert.assertTrue(isBtn1Enabled,"Button 1 is not enabled");
        boolean isBtn2Enabled = home.isButtonEnabled(2);
        Assert.assertFalse(isBtn2Enabled);
    }

    @Test
    public void qeTest5(){
        Reporter.log("======Open HomePage======", true);
        PageFactory_Test5 home = new PageFactory_Test5(driver);

        Reporter.log("======Test 5 : In the test 5 div, wait for a button to be displayed (note: the delay is random) and then click it ======", true);
        Assert.assertTrue(home.isTestButtonDisplayed(), "Test Button is not displayed after a wait time of 7 seconds");

        Reporter.log("======Test 5 : Once you've clicked the button, assert that a success message is displayed ======", true);
        Assert.assertTrue(home.isSuccessMsgDisplayed(),"Success message is not displayed after clicking the button");

        Reporter.log("======Test 5 : Assert that the button is now disabled ======", true);
        Assert.assertFalse(home.isTestButtonDisabled(),"Button is not disabled after displaying alert message");
    }

    @Test
    public void qeTest6(){
        Reporter.log("======Open HomePage======", true);
        PageFactory_Test6 home = new PageFactory_Test6(driver);
        Reporter.log("======Test 6 : find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)======", true);
        Reporter.log("======Test 6 : Assert that the value of the cell is Ventosanzap ======", true);

        String actVal = home.getCellValue(2,2);
        Assert.assertEquals(actVal,"Ventosanzap","Value at coordinates 2,2 does not match 'Ventosanzap'");

    }
}
