package StepDefs;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA8_EditableWishList_Stepdef {

    // 1. Pages
    Home_Page homePage;
    Account_Page accountPage;
    WishList_Page wishListPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA8_EditableWishList_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        accountPage = new Account_Page(Hooks.driver);
        wishListPage = new WishList_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    int PreState;
    int PostState;
    @When("User Click on Wish List Icon")
    public void UserClickOnWishListIcon() {
        accountPage.ClickWishList();
    }

    @And("Check The Pre-edit Wish List State")
    public void checkThePreEditWishListState() {
        PreState = wishListPage.CheckWishListState();
    }

    @And("User Add  Items to Wish List")
    public void userAddItemsToWishList() {
        homePage.AddToWishList();

    }

    @And("Check The Post-edit Wish List State")
    public void checkThePostEditWishListState() {
        PostState = wishListPage.CheckWishListState();
    }


    @Then("The Wish List Must be change")
    public void theWishListMustBeChange() {
        secureAreaPage.ValidateWishListStateChange(PreState, PostState);
    }


}
