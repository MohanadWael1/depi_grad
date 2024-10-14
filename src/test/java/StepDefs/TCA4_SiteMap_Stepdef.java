package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import Pages.SiteMap_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA4_SiteMap_Stepdef {

    // 1. Pages
    Home_Page homePage;
    SiteMap_Page siteMapPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA4_SiteMap_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        siteMapPage = new SiteMap_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click on Site Map")
    public void UserClickOnSiteMap() {
        homePage.ClickOnSiteMap();
    }


    @Then("User must be in Site Map page")
    public void userMustBeInSiteMapPage() {
        secureAreaPage.ValidateSiteMapPage();
    }

    @When("User click on a specific option")
    public void userClickOnASpecificOption() {
        siteMapPage.ChooseOption();
    }

    @Then("User must navigate to its location")
    public void userMustNavigateToItsLocation() {
        secureAreaPage.ValidateNavigationToOptionPage();
    }
}
