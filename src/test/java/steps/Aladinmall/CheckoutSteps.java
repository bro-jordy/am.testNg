package steps.Aladinmall;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobject.Aladinmall.CheckoutPO;
import utilities.ThreadManager;

public class CheckoutSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private CheckoutPO checkout = new CheckoutPO(driver);

    @And("user select courier JNE Promo Ongkir")
    public void select_jne_promo() throws InterruptedException {
        checkout.clickOnJNEPromo();
    }

    @And("user select courier SAP Regular")
    public void select_sap_reg() throws InterruptedException {
        checkout.clickOnSAP();
    }

    @And("user select payment method Shopee")
    public void select_shopee() throws InterruptedException {
        checkout.clickOnShopee();
    }

    @And("user select payment method Gopay")
    public void select_gopay() throws InterruptedException {
        checkout.clickOnGopay();
    }

    @And("user select payment method OVO {string}")
    public void select_ovo(String phoneNumber) throws InterruptedException {
        checkout.clickOnOvo(phoneNumber);
    }

    @And("user select payment method Virtual Account BRI")
    public void select_bri() throws InterruptedException {
        checkout.clickOnBRI();
    }

    @And("user select payment method Virtual Account BCA")
    public void select_bca() throws InterruptedException {
        checkout.clickOnBCA();
    }

    @And("user select payment method Virtual Account Permata")
    public void select_permata() throws InterruptedException {
        checkout.clickOnPermata();
    }

    @And("user select payment method Virtual Account MNC Bank")
    public void select_mnc_bank() throws InterruptedException {
        checkout.clickOnMNCBank();
    }
}
