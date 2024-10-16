package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RandomCategory_Page {

    WebDriver driver;

    public RandomCategory_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void ClickHomePageIconInBreadcrumb(){
        driver.findElement(By.xpath("//*[@id=\"product-category\"]/ul/li[1]")).click();
    }

    public void ClickSortBy(){
        driver.findElement(By.xpath("//*[@id=\"input-sort\"]")).click();
    }

    public void ClickPriceLowToHigh(){
        driver.findElement(By.xpath("//*[@id=\"input-sort\"]/option[4]")).click();
    }

    public void ClickListView(){
        driver.findElement(By.xpath("//*[@id=\"list-view\"]")).click();
    }
}
