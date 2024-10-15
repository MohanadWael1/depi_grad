package StepDefs;

import Pages.Account_Page;
import Pages.Home_Page;
import Pages.SecureAreaPage;
import Pages.ShoppingCart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA7_EditableBasket_Stepdef {

    // 1. Pages
    Home_Page homePage;
    Account_Page accountPage;
    ShoppingCart_Page shoppingCartPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA7_EditableBasket_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        accountPage = new Account_Page(Hooks.driver);
        shoppingCartPage = new ShoppingCart_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    String PreState;
    String PostState;
    @When("User Click on Shopping Cart Icon")
    public void UserClickOnShoppingCartIcon() {
        accountPage.ClickShoppingCart();
    }


    @And("Check The Pre-edit State")
    public void checkThePreEditState() {
        PreState = shoppingCartPage.CheckShoppingCartState();
    }

    @And("Check The Post-edit State")
    public void checkThePostEditState() {
        PostState = shoppingCartPage.CheckShoppingCartState();
    }

    @Then("The Shopping Cart Must be change")
    public void theShoppingCartMustBeChange() {
        secureAreaPage.ValidateShoppingCartStateChange(PreState, PostState);
    }
}
