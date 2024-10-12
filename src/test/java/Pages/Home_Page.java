package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

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

    public void ChangeCurrency(String currency)
    {
        driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
       if(Objects.equals(currency, "Euro"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).click();
       }

       if (Objects.equals(currency, "Pound"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button")).click();
       }

       if (Objects.equals(currency, "Dollar"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button")).click();
       }
    }
}


