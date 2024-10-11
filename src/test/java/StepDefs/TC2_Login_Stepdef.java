package StepDefs;

import Pages.Account_Page;
import Pages.Home_Page;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC2_Login_Stepdef {
    // 1. Pages
    Home_Page HomePage_Object ;
    Login_Page loginPage_Object ;
    Account_Page accountPage_Object;


    // 2. Constructor of definition pages
    public TC2_Login_Stepdef() {
        HomePage_Object    = new Home_Page(Hooks.driver);
        loginPage_Object   = new Login_Page(Hooks.driver);
        accountPage_Object = new Account_Page(Hooks.driver);
    }

    // 3. Steps
    @And("User Click on Login")
    public void UserClickonLogin (){
        HomePage_Object.ClickOnLogin();
    }

    @And("User Enter Email and Password {string} {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        loginPage_Object.Login(email,password);
        loginPage_Object.ClickLoginBtutton();
    }

    @Then("Account Page appears")
    public void accountPageAppears() {
        accountPage_Object.AsserAccountPage();
    }

    @Then("Error message Should be displayed")
    public void errorMessageShouldBeDisplayed() {
        loginPage_Object.AssertErrorMessage();
    }
}
