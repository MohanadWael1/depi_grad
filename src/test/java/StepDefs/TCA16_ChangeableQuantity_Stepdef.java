package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import Pages.ShoppingCart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA16_ChangeableQuantity_Stepdef {

    // 1. Pages
    Home_Page homePage;
    ShoppingCart_Page shoppingCartPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA16_ChangeableQuantity_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        shoppingCartPage = new ShoppingCart_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    String NewQuantity = "5";
    @And("User Change The Quantity")
    public void UserChangeTheQuantity() {
        shoppingCartPage.ChangeTheQuantity(NewQuantity);
    }

    @And("User Refresh The Page")
    public void userRefreshThePage() {
        shoppingCartPage.ClickOnRefreshIcon();
    }

    @Then("The Quantity Must Be Change")
    public void theQuantityMustBeChange() {
        secureAreaPage.ValidateQuantityChange(NewQuantity);
    }
}
