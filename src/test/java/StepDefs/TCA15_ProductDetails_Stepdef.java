package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA15_ProductDetails_Stepdef {

    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA15_ProductDetails_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click On An Item")
    public void UserClickOnAnItem() {
        homePage.ChooseItem();
    }


    @Then("The Item's Details Page Must Be Shown")
    public void theItemSDetailsPageMustBeShown() {
        secureAreaPage.ValidateProductDetailsPage();
    }
}
