package StepDefs;

import Pages.Account_Page;
import Pages.ChangePassword_Page;
import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TCA11_ChangePassword_Stepdef {

    Home_Page homePage_object ;
    SecureAreaPage secureareapage_object;
    Account_Page accountpage_object;
    ChangePassword_Page changepasswordpage_object ;


    public TCA11_ChangePassword_Stepdef() {
        homePage_object = new Home_Page(Hooks.driver);
        secureareapage_object = new SecureAreaPage(Hooks.driver);
        accountpage_object= new Account_Page(Hooks.driver);
        changepasswordpage_object = new ChangePassword_Page(Hooks.driver);

    }


    @And("User Navigate to Change your password page")
    public void UserNavigatetoChangeyourpasswordpage()
    {
        accountpage_object.NavigateToChangePassword();
    }


    @And("User Enters New Password {string} and press continue")
    public void userEntersNewPasswordAndPressContinue(String password) {

        changepasswordpage_object.EnterNewPassword(password);
    }


    @Then("Updating Password successfully message appears")
    public void updatingPasswordSuccessfullyMessageAppears() {
        secureareapage_object.ValidateSuccessfulPasswordChanged();
    }
}
