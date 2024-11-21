package steps.Aladinmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobject.Aladinmall.CartPO;
import utilities.ThreadManager;

public class CartSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private CartPO cart = new CartPO(driver);

    @And("user click on select all product")
    public void user_select_all_product() throws InterruptedException {
        cart.clickOnSelectAllProduct();
    }

    @Then("user click checkout")
    public void user_click_checkout() throws InterruptedException {
        cart.clickOnCheckout();
    }
}
