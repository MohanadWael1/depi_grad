package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Account_Page {
    // 1. WebDriver
    WebDriver driver ;

    // 2. Constructor
    public Account_Page(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Action
    public void AsserAccountPage (){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/account");
        Assert.assertTrue(driver.findElement(By.id("content")).getText().contains("My Account"));
    }

    public void EnterDataInSearch (String product){
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(product);

    }

    public void ClickOnSearchButton()
    {
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
    }

    // problem here
    public void AssertSearchSuccessfully (String prduct){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/search&search=");
    }


}
