package StepDefs;

import Pages.ContactUs_Page;
import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCA1_ContactUs_Stepdef {

    // 1. Pages
    Home_Page homePage;
    ContactUs_Page contactUsPage;
    SecureAreaPage secureAreaPage;



    // 2. Constructor of definition pages
    public TCA1_ContactUs_Stepdef() {
        homePage = new Home_Page(Hooks.driver);
        contactUsPage = new ContactUs_Page(Hooks.driver);
        secureAreaPage = new SecureAreaPage(Hooks.driver);
    }


    // 3. Steps
    @When("User Click on Telephone Icon")
    public void UserClickOnTelephoneIcon() {
        homePage.ClickOnContactUs();
    }


    @Then("You must be in Contact Us page")
    public void youMustBeInContactUsPage() {
        secureAreaPage.ValidateContactUsPage();
    }

    @When("User fill the required information {string} , {string} , {string}")
    public void userFillTheRequiredInformation(String FistName ,String EMailAdd ,String Enquiry) {
        contactUsPage.FillNameField(FistName);
        contactUsPage.FillMailField(EMailAdd);
        contactUsPage.FillEnquiryField(Enquiry);
    }


    @And("Click on submit button")
    public void clickOnSubmitButton() {
        contactUsPage.ClickSubmit();
    }

    @Then("The enquiry must be successfully sent to the store owner")
    public void theEnquiryMustBeSuccessfullySentToTheStoreOwner() {
        secureAreaPage.ValidateEnquirySent();
        contactUsPage.ClickContinue();
    }
}

