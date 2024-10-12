package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchedItem_Page {
    WebDriver driver ;

    public SearchedItem_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void VerifySuccessfulSearch(String text)
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText().contains(text));


    }
}
