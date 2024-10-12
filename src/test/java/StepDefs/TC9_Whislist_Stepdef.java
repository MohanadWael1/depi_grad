package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC9_Whislist_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;


    public TC9_Whislist_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }



    @Then("Number of Items is presented on Homepage {string}")
    public void numberOfItemsIsPresentedOnHomepage(String item) {
        HomePage_Object.SelectItemsToWhisList(item);
    }

    @And("User Add  Items in Homepage to WhishList {string}")
    public void userAddItemsInHomepageToWhishList(String item) {

    }

    @And("User Clicks on HomePage")
    public void userClicksOnHomePage() {
        HomePage_Object.HomePageReturn();
    }
}
