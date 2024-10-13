package StepDefs;

import Pages.Checkout_page;
import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC12_Checkout_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;
    Checkout_page checkout_object ;

    public TC12_Checkout_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
        checkout_object = new Checkout_page(Hooks.driver);
    }


    @And("User Navigates to checkout page")
    public void UserNavigatestocheckoutpage()
    {
        HomePage_Object.NavigatetoCheckoutMenu();
    }


    @And("User Enters Valid Credentials in Billing Details {string} , {string} , {string},{string},{string},{string}")
    public void userEntersValidCredentialsInBillingDetails(String Fname, String Lname, String Add1, String City, String Country, String Region) {
        checkout_object.NewAddressRadioButtonClick();
        checkout_object.EnterBillingDetailsCredentials(Fname, Lname , Add1 , City , Country, Region);

    }

    @And("User Confirm Delivery Details")
    public void userConfirmDeliveryDetails() {
        checkout_object.EnterDeliveryDetails();
    }

    @And("User Select Delivery Method")
    public void userSelectDeliveryMethod() {
        checkout_object.EnterDeliveryMethod();
    }


    @And("User Select Payment Method")
    public void userSelectPaymentMethod() {
        checkout_object.EnterPaymentMethod();
    }


    @And("User Confirm Order Details")
    public void userConfirmOrderDetails() {
        checkout_object.EnterOrderConfirmation();
    }


    @Then("Order Confirmation message appear")
    public void orderConfirmationMessageAppear() {
        SecureAreaPage_Object.ValidateOrderPlacing();
    }
}
