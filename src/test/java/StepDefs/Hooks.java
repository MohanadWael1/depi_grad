package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver ;

    @Before
    public void OpenBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void CloseBrowser()
    {
        driver.quit();
    }
}
