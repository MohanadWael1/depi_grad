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

    public void CurrencyChangeValidation()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong")).getText().contains("€") ||
                driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong")).getText().contains("£") ||
                driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong")).getText().contains("$"));
    }


    public void ValidateTheChosenCategoryPageWillBeShown(){
        Assert.assertTrue( driver.findElement(By.xpath("/html/body/div[2]/div/div/h2")).isDisplayed() );
    }

    public void ValidateNumberOfSelectedFeaturesInWishList(String item)
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span")).getText().contains(item));
    }

    public void ValidateSuccessfulCompareList()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"common-home\"]/div[1]")).isDisplayed());
    }

    public void ValidateOrderPlacing()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
    }
}
