package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA2_AboutUs_Stepdef {

    // 1. Pages
    Home_Page homePage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA2_AboutUs_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);

    }


    // 3. Steps
    @When("User Click on About US")
    public void UserClickOnAboutUS() {
        homePage.ClickOnAboutUs();
    }

    @Then("You must be in About Us page")
    public void youMustBeInAboutUsPage() {
        secureAreaPage.ValidateAboutUsPage();
    }
}
