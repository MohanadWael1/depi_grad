package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Page {
    WebDriver driver ;

    public Register_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterFirstName(String Fname)
    {
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(Fname);
    }

    public void EnterLastName(String Lname)
    {
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(Lname);
    }

    public void EnterMail(String mail)
    {
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(mail);
    }

    public void Enterphone(String phone)
    {
        driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys(phone);
    }

    public void Enterpassword(String password)
    {
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
    }

    public void Enterpasswordconfirm(String password)
    {
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys(password);
    }

    public void AcceptPrivacypolicy()
    {
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
    }

    public void Continuebtnclick()
    {
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
    }








}
