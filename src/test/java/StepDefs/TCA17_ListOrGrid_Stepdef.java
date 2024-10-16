package StepDefs;

import Pages.Home_Page;
import Pages.RandomCategory_Page;
import Pages.SecureAreaPage;
import Pages.ShoppingCart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TCA17_ListOrGrid_Stepdef {

    // 1. Pages
    RandomCategory_Page randomCategoryPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA17_ListOrGrid_Stepdef() {
        randomCategoryPage = new RandomCategory_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @And("User Click on List")
    public void UserClickOnList() {
        randomCategoryPage.ClickListView();
    }

    @Then("The View Method Must Be Change")
    public void theViewMethodMustBeChange() {
        secureAreaPage.ValidateViewChange();
    }
}
