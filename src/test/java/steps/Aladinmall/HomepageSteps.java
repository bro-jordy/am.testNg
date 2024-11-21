package steps.Aladinmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageobject.Aladinmall.HomepagePO;
import utilities.ThreadManager;

public class HomepageSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private HomepagePO homepage = new HomepagePO(driver);

    Actions action = new Actions(driver);

    @Then(("user click on masuk button"))
    public void user_click_login_button() throws InterruptedException {
        homepage.clickOnLoginButton();
    }

    @Then("user added product {string} to cart")
    public void search_product(String product) throws InterruptedException{
        Thread.sleep(2000);
        homepage.search(product + Keys.ENTER);
        homepage.addRandomProductToCart(action);
        Thread.sleep(2000);
        homepage.clickOnHomeButton();
    }

    @Then("user click on cart icon")
    public void click_cart_icon() throws InterruptedException{
        homepage.clickOnCart(action);
        Thread.sleep(500);
    }
}
