package StepDefs;

import Pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA9_Breadcrumb_Stepdef {

    // 1. Pages
    RandomCategory_Page randomCategoryPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA9_Breadcrumb_Stepdef() {
        randomCategoryPage = new RandomCategory_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click on HomePage Icon In Breadcrumb")
    public void UserClickOnHomePageIconInBreadcrumb() {
        randomCategoryPage.ClickHomePageIconInBreadcrumb();

    }

    @Then("User Must be In Home Page")
    public void userMustBeInHomePage() {
        secureAreaPage.ValidateHomePage();
    }

}
