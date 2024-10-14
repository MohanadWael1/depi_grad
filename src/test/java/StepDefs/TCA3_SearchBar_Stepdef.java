package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA3_SearchBar_Stepdef {

    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA3_SearchBar_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);

    }


    // 3. Steps
    @When("User Click on search box and write a specific product to search")
    public void UserClickOnSearchBoxAndWriteSpecificProductToSearch() {
        homePage.SearchOnProduct("Laptop");
    }

    @And("User Click on Search Icon")
    public void userClickOnSearchIcon() {
        homePage.ClickSearchIcon();
    }

    @Then("The search result must be shown")
    public void theSearchResultMustBeShown() {
        secureAreaPage.ValidateSearchResults();
    }
}
