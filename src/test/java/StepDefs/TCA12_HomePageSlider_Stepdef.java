package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TCA12_HomePageSlider_Stepdef {

    Home_Page homePage_Object;
    SecureAreaPage secureAreaPage_Object;

    public TCA12_HomePageSlider_Stepdef() {
        homePage_Object = new Home_Page(Hooks.driver);
        secureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }

    @And ("User Hover to slider arrow and Click on It")
    public void UserHovertosliderarrowandClickonIt()
    {
        homePage_Object.HomePageSliderHoverAndClick();
    }

    @Then("Slider Item is Changed")
    public void sliderItemIsChanged() {
        secureAreaPage_Object.ValidateSliderItemChanged();
    }
}
