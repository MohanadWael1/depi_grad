package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA5_ItemsInfo_Stepdef {


    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA5_ItemsInfo_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click on Item's Icon")
    public void UserClickOnItemIcon() {
        homePage.ClickOnItemIcon();
    }

    @Then("User must show information about chose items")
    public void userMustShowInformationAboutChoseItems() {
        secureAreaPage.ValidateItemIconInfo();
    }
}
