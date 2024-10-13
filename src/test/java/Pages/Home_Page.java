package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class Home_Page {
    WebDriver driver ;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
        initializeCategories();
    }


    public void NavigateToHomepage()
    {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    public void ClickOnMyAccount()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
    }

    public void ClickOnLogin()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
    }

    public void ClickOnRegister()
    {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
    }

    public void ChangeCurrency(String currency)
    {
        driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
       if(Objects.equals(currency, "Euro"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).click();
       }

       if (Objects.equals(currency, "Pound"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button")).click();
       }

       if (Objects.equals(currency, "Dollar"))
       {
           driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button")).click();
       }
    }
    /*********** Main and Sub Categories Mapping ***********/
    // Create a Map to store main categories and their corresponding subcategories
    Map<String, List<String>> categories = new HashMap<>();

    private void initializeCategories() {
        // Add main categories and their subcategories (based on their known XPaths)
        //Desktops main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[1]/a", Arrays.asList(
                "/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a"
        ));

        //Laptops&Notebooks main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[2]/a", Arrays.asList(
                "/html/body/div[1]/nav/div[2]/ul/li[2]/div/div/ul/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[2]/div/div/ul/li[2]/a"
        ));

        //Components main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[3]/a", Arrays.asList(
                "/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[2]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[3]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[4]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[5]/a"
        ));

        //Tablets main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[4]/a", new ArrayList<>());

        //Software main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[5]/a", new ArrayList<>());

        //Phones&PDAs main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[6]/a", new ArrayList<>());

        //Cameras main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[7]/a", new ArrayList<>());

        //MP3 Players main and sub categories
        categories.put("/html/body/div[1]/nav/div[2]/ul/li[8]/a", Arrays.asList(
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[2]/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[2]/li[3]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[2]/li[4]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[2]/li[5]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[3]/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[3]/li[2]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[3]/li[3]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[3]/li[4]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[3]/li[5]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[4]/li[1]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[4]/li[2]/a",
                "/html/body/div[1]/nav/div[2]/ul/li[8]/div/div/ul[4]/li[3]/a"
        ));
    }
    /******************************************************/

    public void selectRandomCategory() {
        // Randomly select a main category
        Random random = new Random();
        List<String> mainCategoryXPaths = new ArrayList<>(categories.keySet());
        String selectedMainCategoryXPath = mainCategoryXPaths.get(random.nextInt(mainCategoryXPaths.size()));

        // Click on the selected main category
        driver.findElement(By.xpath(selectedMainCategoryXPath)).click();

        // Get the subcategories for the selected main category
        List<String> subCategoryXPaths = categories.get(selectedMainCategoryXPath);

        // Check if there are subcategories
        if (!(subCategoryXPaths.isEmpty())) {
            // Randomly select a subcategory
            String selectedSubCategoryXPath = subCategoryXPaths.get(random.nextInt(subCategoryXPaths.size()));

            // Click on the selected subcategory
            driver.findElement(By.xpath(selectedSubCategoryXPath)).click();
        }
    }


    public void hoverRandomCategory() {
        Random random = new Random();
        List<String> mainCategories = new ArrayList<>(categories.keySet());
        String randomMainCategoryXPath = mainCategories.get(random.nextInt(mainCategories.size()));

        WebElement mainCategoryElement = driver.findElement(By.xpath(randomMainCategoryXPath));

        //Perform Hover
        Actions actions = new Actions(driver);
        actions.moveToElement(mainCategoryElement).perform();

        //Waiting
        try {
            Thread.sleep(500); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Subcategories
        List<String> subCategories = categories.get(randomMainCategoryXPath);
        if (!subCategories.isEmpty()) {
            String randomSubCategoryXPath = subCategories.get(random.nextInt(subCategories.size()));
            WebElement subCategoryElement = driver.findElement(By.xpath(randomSubCategoryXPath));
            //Perform Hover
            actions.moveToElement(subCategoryElement).perform();
        }
    }

    public void SelectItemsToWhisList(String item)
    {
        int i ;
        String[] HomepageItems={"//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]",
                "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]",
                "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]",
                "//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[2]"};

            if(Objects.equals(item, ""))
            {
                i = 0 ;
            }

            else
            {
                i = Integer.valueOf(item);
            }


        for(int j=0 ; j<i ; j++)
        {
            driver.findElement(By.xpath(HomepageItems[j])).click();
        }
    }

    public void HomePageReturn()
    {
        driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click();
    }

    public void AddItemsToCompareList()
    {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]")).click();
    }

}


