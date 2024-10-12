package StepDefs;

import Pages.Account_Page;
import Pages.SearchedItem_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC4_Search_Stepdef {
    // 1. Pages
    Account_Page accountPage_Object;
    SearchedItem_Page searched_item_object ;

    // 2. Constructor of definition pages
    public TC4_Search_Stepdef() {
        accountPage_Object = new Account_Page(Hooks.driver);
        searched_item_object = new SearchedItem_Page(Hooks.driver);
    }

    // 3. Steps
    @And("User Enter Product in search {string}")
    public void userEnterProductInSearch(String product) {
        accountPage_Object.EnterDataInSearch(product);
        accountPage_Object.ClickOnSearchButton();
    }



    @Then("Assert Search Page Appearance of {string}")
    public void assertSearchPageAppearanceOf(String text) {
        searched_item_object.VerifySuccessfulSearch(text);
    }


//    @Then("User Can Change Currencies from $ US Dollar To € Euro")
//    public void userCanChangeCurrenciesFrom$USDollarTo€Euro() {
//        accountPage_Object.ClickOnCurrenciesButton();
//        accountPage_Object.SelectEuro();
//    }
}
