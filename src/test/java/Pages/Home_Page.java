package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    WebDriver driver ;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void NavigateToHomepage()
    {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    public void ClickOnMyAccount()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
    }

    public void ClickOnLogin()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
    }

    public void ClickOnRegister()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
    }
}


