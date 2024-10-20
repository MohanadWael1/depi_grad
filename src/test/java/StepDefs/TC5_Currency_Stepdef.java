package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_Currency_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;

    public TC5_Currency_Stepdef() {

        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }


    @When("User Change Currency {string}")
    public void userChangeCurrency(String currency) {
        HomePage_Object.ChangeCurrency(currency);
    }

    @Then("User Can Change Currencies from $ US Dollar To € Euro")
    public void userCanChangeCurrenciesFrom$USDollarTo€Euro() {
    SecureAreaPage_Object.CurrencyChangeValidation();
    }
}

