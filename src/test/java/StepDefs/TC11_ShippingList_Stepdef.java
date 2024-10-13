package StepDefs;

import Pages.Home_Page;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;

public class TC11_ShippingList_Stepdef {
    Home_Page HomePage_Object ;
    SecureAreaPage SecureAreaPage_Object;

    public TC11_ShippingList_Stepdef() {
        HomePage_Object = new Home_Page(Hooks.driver);
        SecureAreaPage_Object = new SecureAreaPage(Hooks.driver);
    }

    @And("User Add Product to Shipping List")
    public void UserAddProducttoShippingList()
    {
        HomePage_Object.AddItemsToShippingList();
    }
}
