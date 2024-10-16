package StepDefs;

import Pages.Home_Page;
import Pages.RandomCategory_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA14_ItemsFiltration_Stepdef {

    // 1. Pages
    Home_Page homePage;
    RandomCategory_Page randomCategoryPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA14_ItemsFiltration_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        randomCategoryPage = new RandomCategory_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click On Phones Category")
    public void UserClickOnPhonesCategory() {
        homePage.ClickOnPhoneCategory();

    }

    @And("User Click On Sort By")
    public void userClickOnSortBy() {
        randomCategoryPage.ClickSortBy();
    }

    @And("User Click On Price Option")
    public void userClickOnPriceOption() {
        randomCategoryPage.ClickPriceLowToHigh();
    }

    @Then("The Items Must Be Sorted")
    public void theItemsMustBeSorted() {
        secureAreaPage.ValidateSortedByPrice();
    }
}
