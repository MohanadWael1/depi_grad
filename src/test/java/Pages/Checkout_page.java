package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkout_page {
    WebDriver driver ;


    public Checkout_page(WebDriver driver) {
        this.driver = driver;
    }

    public void NewAddressRadioButtonClick()
    {
        try {
            Thread.sleep(900); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")).click();
    }

    public void EnterBillingDetailsCredentials(String Fname  , String Lname , String Add1 , String City , String Country , String Region)
    {
        driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).sendKeys(Fname);
        driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).sendKeys(Lname);
        driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")).sendKeys(Add1);
        driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]")).sendKeys(City);

        Select country_obj = new Select(driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")));
        country_obj.selectByIndex(2);


        Select Region_obj = new Select(driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]")));
        Region_obj.selectByIndex(3);


        driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
    }


    public void EnterDeliveryDetails()
    {
        try {
            Thread.sleep(900); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"collapse-shipping-address\"]/div/form/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]")).click();
    }

    public void EnterDeliveryMethod()
    {
        driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
    }

    public void EnterPaymentMethod()
    {
        driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();

    }

    public void EnterOrderConfirmation()
    {
        driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
    }






}
