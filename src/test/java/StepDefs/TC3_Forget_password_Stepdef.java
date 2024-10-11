package StepDefs;

import Pages.Forgotten_Page;
import Pages.Home_Page;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC3_Forget_password_Stepdef {
    // 1. Pages
    Home_Page HomePage_Object ;
    Login_Page loginPage_Object ;
    Forgotten_Page forgottenPage_Object;

    // 2. Constructor of definition pages
    public TC3_Forget_password_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        loginPage_Object = new Login_Page(Hooks.driver);
        forgottenPage_Object = new Forgotten_Page(Hooks.driver);
    }

    // 3. Steps
    @And("User Click On Forgotten Password Button")
    public void UserClickOnForgottenPasswordButton (){
        loginPage_Object.ClickForgottenPasswordBtutton();
    }

    @And("User Enters Valid Email {string}")
    public void userEntersValidEmail(String email) {
        forgottenPage_Object.UserEntersEmail(email);
    }

    @Then("Assert confirmation link has been sent email")
    public void assertConfirmationLinkHasBeenSentEmail() {
        loginPage_Object.AssertPasswordSendsToEmail();
    }


    @Then("Assert Error Message Appearance")
    public void assertErrorMessageAppearance() {
        forgottenPage_Object.AssertErrorMessageAppearance();
    }
}
