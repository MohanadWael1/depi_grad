package StepDefs;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TCA10_AccountEdition_Stepdef {

    Home_Page homePage_object;
    Account_Page accountPage_object;
    EditAccount_Page  editaccountpage_object;
    SecureAreaPage secureAreaPage_object;

    public TCA10_AccountEdition_Stepdef() {
        homePage_object = new Home_Page(Hooks.driver);
        accountPage_object = new Account_Page(Hooks.driver);
        editaccountpage_object = new EditAccount_Page(Hooks.driver);
        secureAreaPage_object = new SecureAreaPage(Hooks.driver);
    }


    @And ("User Navigate to Edit account information page")
    public void UserNavigatetoEditaccountinformationpage()
    {
        accountPage_object.NavigateToEdityouraccountInfomation();
    }

    @And("User Change Credentials to {string} , {string} and press Continue button")
    public void userChangeCredentialsToAndPressContinueButton(String Fname, String Lname) {
        editaccountpage_object.EditAccountCredentials(Fname , Lname);
    }

    @Then("Account Edition Message Appears")
    public void accountEditionMessageAppears() {
        secureAreaPage_object.ValidateAccountEditSuccessfully();
    }
}
