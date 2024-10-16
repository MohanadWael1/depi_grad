package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class EditAccount_Page {

    WebDriver driver ;

    public EditAccount_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void EditAccountCredentials(String Fname , String Lname)
    {
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).clear();

        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(Fname);
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).clear();


        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(Lname);

        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
    }
}
