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

    public void ValidateContactUsPage() {
        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText() , "Contact Us");
    }

    public void ValidateEnquirySent() {
        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText() , "Your enquiry has been successfully sent to the store owner!");
    }

    public void ValidateAboutUsPage() {
        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText() , "About Us");
    }

    public void ValidateSearchResults() {
        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"content\"]/label")).getText() , "Search Criteria");
    }

    public void ValidateSiteMapPage() {
        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText() , "Site Map");
    }

    public void ValidateNavigationToOptionPage(){
        Assert.assertTrue( driver.findElement(By.xpath("/html/body/div[2]/div/div/h2")).isDisplayed() );
    }

    public void ValidateItemIconInfo() {
        Assert.assertTrue( driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[1]/td[1]/strong")).isDisplayed() );
        Assert.assertTrue( driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[2]/td[1]/strong")).isDisplayed() );
    }

    public void ValidatePreCostIsDifferentFromPostCost(String pre, String post) {
        Assert.assertNotEquals(pre, post);
    }


    public void ValidateLogout()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
    }


    public void ValidateSliderItemChanged()
    {
       Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"slideshow0\"]/div/div[4]/a/img")).isDisplayed());
    }

    public void ValidateSuccessfulPasswordChanged()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]")).getText().contains("Success: Your password has been successfully updated."));
    }

}
