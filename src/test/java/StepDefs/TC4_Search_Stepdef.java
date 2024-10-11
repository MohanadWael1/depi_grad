package StepDefs;

import Pages.Account_Page;
import Pages.Forgotten_Page;
import Pages.Home_Page;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC4_Search_Stepdef {
    // 1. Pages
    Account_Page accountPage_Object;

    // 2. Constructor of definition pages
    public TC4_Search_Stepdef() {
        accountPage_Object = new Account_Page(Hooks.driver);
    }

    // 3. Steps
    @And("User Enter Product in search {string}")
    public void userEnterProductInSearch(String product) {
        accountPage_Object.EnterDataInSearch(product);
        accountPage_Object.ClickOnSearchButton();
    }

    @Then ("Assert Search Page Appearance")
    public void AssertSearchPageAppearance (){

    }


}
