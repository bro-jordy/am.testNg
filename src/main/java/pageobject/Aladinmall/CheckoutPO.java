package pageobject.Aladinmall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

import javax.swing.plaf.TableHeaderUI;

public class CheckoutPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public CheckoutPO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    @FindBy(xpath = "//div[contains(text(), 'Pilih Pengiriman')]")
    private WebElement courierButton;

    @FindBy(xpath = "//div[@class='grid grid-cols-12 content-center cursor-pointer h-24 gap-4 pl-4']//*[contains(text(), 'Rp. 0')]")
    private WebElement jnePromo;

    @FindBy(xpath = "//*[contains(text(), 'SATRIA REG')]")
    private WebElement sapReg;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/div/div/div[1]/div[2]/div/div/div[2]/div[4]/div[1]")
    private WebElement scroll;

    @FindBy(id = "button-select-payment")
    private WebElement selectPayment;

    @FindBy(xpath = "//*[contains(text(), 'ShopeePay/SpayLater')]" )
    private WebElement shopee;

    @FindBy(xpath = "//*[contains(text(), 'OVO')]" )
    private WebElement ovo;

    @FindBy(xpath = "//*[contains(text(), 'Go-Pay')]" )
    private WebElement gopay;

    @FindBy(xpath = "//*[contains(text(), 'Virtual Account BRI')]" )
    private WebElement bri;

    @FindBy(xpath = "//*[contains(text(), 'Virtual Account BCA')]" )
    private WebElement bca;

    @FindBy(xpath = "//*[contains(text(), 'Virtual Account Permata')]" )
    private WebElement permata;

    @FindBy(xpath = "//*[contains(text(), 'Virtual Account MNC Bank')]" )
    private WebElement mncbank;

    @FindBy(id = "button-bayar")
    private WebElement buttonBayar;

    @FindBy(xpath = "//*[@id=\"__next\"]//*[@type=\"number\"]")
    private WebElement inputPhoneNumber;

    /**
     * Click on jne promo ongkir button
     * @throws InterruptedException
     */
    public void clickOnJNEPromo() throws InterruptedException {
        selenium.clickOn(courierButton);
        selenium.clickOn(jnePromo);
        selenium.scrollToElement(scroll);
        Thread.sleep(2000);
    }

    /**
     * Click on sap regular button
     * @throws InterruptedException
     */
    public void clickOnSAP() throws InterruptedException {
        selenium.clickOn(courierButton);
        selenium.clickOn(sapReg);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on shopee button
     * @throws InterruptedException
     */
    public void clickOnShopee() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(shopee);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on gopay button
     * @throws InterruptedException
     */
    public void clickOnGopay() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(gopay);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on ovo button
     * @throws InterruptedException
     */
    public void clickOnOvo(String phoneNumber) throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(ovo);
        selenium.enterText(inputPhoneNumber, phoneNumber, true);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on virtual account bri button
     * @throws InterruptedException
     */
    public void clickOnBRI() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(bri);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on virtual account bca button
     * @throws InterruptedException
     */
    public void clickOnBCA() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(bca);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on virtual account permata button
     * @throws InterruptedException
     */
    public void clickOnPermata() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(permata);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

    /**
     * Click on virtual account mnc bank button
     * @throws InterruptedException
     */
    public void clickOnMNCBank() throws InterruptedException {
        selenium.clickOn(selectPayment);
        Thread.sleep(1000);
        selenium.clickOn(mncbank);
        selenium.clickOn(buttonBayar);
        selenium.waitForJavascriptToLoad();
        Thread.sleep(2000);
    }

}
