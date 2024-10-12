package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage {
    WebDriver driver ;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ValidateSuccessfulRegistry()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText().contains("Your Account Has Been Created!"));
    }

    public void ValidateUnsuccessfulRegistry()
    {
        Assert.assertTrue(driver.findElement(By.className("text-danger")).isDisplayed());
    }

    public void ValidateTheChosenCategoryPageWillBeShown(){
        Assert.assertTrue( driver.findElement(By.xpath("/html/body/div[2]/div/div/h2")).isDisplayed() );
    }
}
