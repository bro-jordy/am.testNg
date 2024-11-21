package pageobject.Aladinmall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

import java.util.List;
import java.util.Random;

public class HomepagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public HomepagePO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    /*
     * All WebElements are identified by @FindBy annotation
     *
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
     * className, xpath as attributes.
     */

    @FindBy (id = "nav-AladinHome")
    private WebElement home;

    @FindBy (id = "button-masuk")
    private WebElement LoginButton;

    @FindBy (xpath = "//*[@type=\"search\"]")
    private WebElement search;

    @FindBy (xpath = "//div[@id=\"plp-container-grid-desktop\"]//*[@id=\"button-product-filter\"]")
    private List<WebElement> products;

    @FindBy (xpath = "//*[@id=\"add-to-cart-plp-desktop\"]//*[@id=\"button-product-filter\"]")
    private WebElement addToCart;

    @FindBy (id = "button-cart")
    private WebElement cartButton;

    /**
     * Click on home button
     * @throws InterruptedException
     */
    public void clickOnHomeButton() throws InterruptedException {
        selenium.clickOn(home);
        selenium.waitForJavascriptToLoad();
    }

    /**
     * Click on masuk button
     * @throws InterruptedException
     */
    public void clickOnLoginButton() throws InterruptedException {
        selenium.clickOn(LoginButton);
        selenium.waitForJavascriptToLoad();
    }

    /**
     * Enter product name
     * @param product
     */
    public void search(String product) {
        search.clear();
        selenium.enterText(search, product, true);
    }

    /**
     * Hover over a random product to display "+ Keranjang" button and click it
     * @throws InterruptedException
     */
    public void addRandomProductToCart(Actions action) throws InterruptedException {
        Random rand = new Random();
        WebElement randomProduct = products.get(rand.nextInt(products.size())); // Select random product

        // Move to the product container to hover and display the "+Keranjang" button
        action.moveToElement(randomProduct).perform();
        selenium.waitForJavascriptToLoad(); // Wait for button to be visible

        // Ensure the "+ Keranjang" button is within the product and becomes visible on hover
        WebElement addToCartButton = randomProduct.findElement(By.xpath("//button[contains(text(), '+ Keranjang')]"));
        selenium.clickOn(addToCartButton);
        selenium.waitForJavascriptToLoad();
        selenium.clickOn(addToCart);
    }

    /**
     * Hover over on cart button to display "Lihat Keranjang" button and click it
     * @throws InterruptedException
     */
    public void clickOnCart(Actions action) throws InterruptedException {
        Random rand = new Random();
        WebElement cart = cartButton;

        // Move to the cart container to hover and display the "Lihat Kenajang" button
        action.moveToElement(cart).perform();
        selenium.waitForJavascriptToLoad(); // Wait for button to be visible

        // Ensure the "+Lihat Kenajang" button is visible on hover
        WebElement cartButtons = cart.findElement(By.xpath("//button[contains(text(), 'Lihat Keranjang')]"));
        selenium.clickOn(cartButtons);
        selenium.waitForJavascriptToLoad();
    }
}
