package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TCA13_Logout_Stepdef {
    Home_Page homePage_Object;
    SecureAreaPage secureAreaPage_Object;

    public TCA13_Logout_Stepdef() {
        homePage_Object = new Home_Page(Hooks.driver);
        secureAreaPage_Object = new SecureAreaPage(Hooks.driver);



    }

    @And("User Clicks on Logout")
    public void UserClicksonLogout()
    {
        homePage_Object.Logout();
    }

    @Then("Account Logout Page Apeears")
    public void accountLogoutPageApeears() {
        secureAreaPage_Object.ValidateLogout();
    }
}
