package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword_Page {
    WebDriver driver ;

    public ChangePassword_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void EnterNewPassword(String password)
    {
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(password);


        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
    }

}
