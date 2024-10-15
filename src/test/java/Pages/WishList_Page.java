package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WishList_Page {

    WebDriver driver;

    public WishList_Page(WebDriver driver) {
        this.driver = driver;
    }

    public int CheckWishListState(){

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"content\"]/p"));
        int rowCount;
        if(elements.isEmpty()){
            List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody"));
            rowCount = rows.size();
            System.out.println(rowCount);
        }
        else{
            rowCount = 0;
        }

        return rowCount;
    }
}
