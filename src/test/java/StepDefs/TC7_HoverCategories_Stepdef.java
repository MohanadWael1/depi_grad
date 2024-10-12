package StepDefs;

import Pages.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC7_HoverCategories_Stepdef {

    // 1. Pages
    Home_Page homePage;



    // 2. Constructor of definition pages
    public TC7_HoverCategories_Stepdef() {
        homePage = new Home_Page(Hooks.driver);

    }


    // 3. Steps
    @When("User Hover On Category Randomly")
    public void UserHoverOnCategoryRandomly() {
        homePage.hoverRandomCategory();
    }

    @Then("The category should display a shadow behind it")
    public void theCategoryShouldDisplayAShadowBehindIt() {
        //No Assertion
    }


}
