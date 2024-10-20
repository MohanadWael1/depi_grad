package StepDefs;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver driver ;

    @BeforeAll
    public static void OpenBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void CloseBrowser()
    {
        driver.quit();
    }

    @AfterStep
    public static void TakeScreenshot (Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }
}
