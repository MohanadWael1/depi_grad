package StepDefs;

import Pages.Home_Page;
import Pages.Register_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Regisrty_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;
    Register_Page RegisterPage_Object;

    public TC1_Regisrty_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
        RegisterPage_Object = new Register_Page(Hooks.driver);
    }

    @Given("User Navigates to HomePage")
    public void UserNavigatestoHomePage() {
        
        HomePage_Object.NavigateToHomepage();
    }


    @When("User Clicks on My Account Icon")
    public void userClicksOnMyAccountIcon() {
        HomePage_Object.ClickOnMyAccount();
    }


    @And("User Click on Register")
    public void userClickOnRegister() {
        HomePage_Object.ClickOnRegister();
    }


    @And("User Enters Credentials {string} , {string} ,{string} , {string} ,{string}")
    public void userEntersValidCredentials(String Fname, String Lname, String mail, String phone, String password) {
        RegisterPage_Object.EnterFirstName(Fname);
        RegisterPage_Object.EnterLastName(Lname);
        RegisterPage_Object.EnterMail(mail);
        RegisterPage_Object.Enterphone(phone);
        RegisterPage_Object.Enterpassword(password);
        RegisterPage_Object.Enterpasswordconfirm(password);
        RegisterPage_Object.AcceptPrivacypolicy();
    }

    @And("User Click Continue")
    public void userClickContinue() {
        RegisterPage_Object.Continuebtnclick();
    }



    @Then("Successfully Creation should be displayed")
    public void successfullyCreationShouldBeDisplayed() {
        SecureAreaPage_Object.ValidateSuccessfulRegistry();

    }





    @Then("Unsuccessfull Registry Message appears")
    public void unsuccessfullRegistryMessageAppears() {
        SecureAreaPage_Object.ValidateUnsuccessfulRegistry();

    }
}
