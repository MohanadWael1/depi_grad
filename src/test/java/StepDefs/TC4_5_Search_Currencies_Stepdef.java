package StepDefs;

import Pages.Account_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC4_5_Search_Currencies_Stepdef {
    // 1. Pages
    Account_Page accountPage_Object;

    // 2. Constructor of definition pages
    public TC4_5_Search_Currencies_Stepdef() {
        accountPage_Object = new Account_Page(Hooks.driver);
    }

    // 3. Steps
    @And("User Enter Product in search {string}")
    public void userEnterProductInSearch(String product) {
        accountPage_Object.EnterDataInSearch(product);
        accountPage_Object.ClickOnSearchButton();
    }

    @And ("Assert Search Page Appearance")
    public void AssertSearchPageAppearance (){
        accountPage_Object.AssertSearchSuccessfully();
    }


    @Then("User Can Change Currencies from $ US Dollar To € Euro")
    public void userCanChangeCurrenciesFrom$USDollarTo€Euro() {
        accountPage_Object.ClickOnCurrenciesButton();
        accountPage_Object.SelectEuro();
    }
}
