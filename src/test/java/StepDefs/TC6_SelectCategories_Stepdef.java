package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_SelectCategories_Stepdef {

    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;


    // 2. Constructor of definition pages
    public TC6_SelectCategories_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click On Category Randomly")
    public void UserClickOnCategoryRandomly() {
        homePage.selectRandomCategory();
    }

    @Then("The Chosen Category Page Will Be Shown")
    public void theChosenCategoryPageWillBeShown() {
        secureAreaPage.ValidateTheChosenCategoryPageWillBeShown();
    }
}
