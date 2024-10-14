package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs_Page {

    WebDriver driver;

    public ContactUs_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void FillNameField (String name) {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[1]/div/input")).sendKeys(name);
    }

    public void FillMailField (String mail) {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[2]/div/input")).sendKeys(mail);
    }

    public void FillEnquiryField (String enquiry) {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[3]/div/textarea")).sendKeys(enquiry);
    }

    public void ClickSubmit() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input")).click();
    }

    public void ClickContinue() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
    }
}
