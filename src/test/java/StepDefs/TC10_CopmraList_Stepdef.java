package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC10_CopmraList_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;

    public TC10_CopmraList_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }

    @And("User Add Product to Compare List")
    public void UserAddProducttoCompareList()
    {


    }

    @Then("Confirmation Message Appears")
    public void confirmationMessageAppears() {
    }
}
