package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Forgotten_Page {

    // 1. WebDriver
    WebDriver driver ;

    // 2. Constructor
    public Forgotten_Page(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Action
    public void UserEntersEmail (String email){
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
    }

    public void AssertErrorMessageAppearance (){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-forgotten\"]/div[1]")).getText().contains("Warning: The E-Mail Address was not found in our records, please try again!"));
    }

}
