package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart_Page {

    WebDriver driver;

    public ShoppingCart_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String CheckShoppingCartState(){

        String state;
        if(driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText().equals("Your shopping cart is empty!")){
            state = "empty";
        }
        else{
            state = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
        }

        return state;
    }

    public void ChangeTheQuantity(String quantity){
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).sendKeys(quantity);
    }

    public void ClickOnRefreshIcon(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")).click();
    }


}
