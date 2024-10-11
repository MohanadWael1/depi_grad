package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_Page {
    // 1. WebDriver
    WebDriver driver ;

    // 2. Constructor
    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Action
    public void Login (String email , String password){
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    public void  ClickLoginBtutton (){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    }

    public void ClickForgottenPasswordBtutton (){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")).click();
    }

    public void AssertErrorMessage (){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText().contains("Warning"));
    }

    public void AssertPasswordSendsToEmail (){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText().contains("An email with a confirmation link has been sent your email address."));
    }

}
