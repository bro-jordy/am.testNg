package pageobject.Aladinmall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class CartPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public CartPO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    @FindBy(id = "action-select-all-in-stock-cart-items")
    private WebElement selectAll;

    @FindBy(id = "action-checkout")
    private WebElement checkoutButton;

    /**
     * Click on select all button
     * @throws InterruptedException
     */
    public void clickOnSelectAllProduct() throws InterruptedException {
        selenium.clickOn(selectAll);
        selenium.waitForJavascriptToLoad();
    }

    /**
     * Click on checkout button
     * @throws InterruptedException
     */
    public void clickOnCheckout() throws InterruptedException {
        selenium.clickOn(checkoutButton);
        selenium.waitForJavascriptToLoad();
    }
}
