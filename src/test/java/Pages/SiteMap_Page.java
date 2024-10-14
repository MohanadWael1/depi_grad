package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteMap_Page {

    WebDriver driver;

    public SiteMap_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ChooseOption() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[4]/a")).click();
    }
}
