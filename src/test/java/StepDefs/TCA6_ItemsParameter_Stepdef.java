package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA6_ItemsParameter_Stepdef {


    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA6_ItemsParameter_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    String PreAddValue;
    String PostAddValue;
    @Then("The Pre-adding cost must be shown")
    public void ThePreAddingCostMustBeShown(){
        PreAddValue = homePage.ItemsCostValue();
    }

    @And("User Add an item to basket")
    public void userAddAnItemToBasket() {
        homePage.AddItemsToShippingList();
    }

    @Then("The Post-adding cost must be different from Pre-adding cost")
    public void thePostAddingCostMustBeDifferentFromPreAddingCost() {
        PostAddValue = homePage.ItemsCostValue();
        secureAreaPage.ValidatePreCostIsDifferentFromPostCost(PreAddValue,PostAddValue);
    }
}
