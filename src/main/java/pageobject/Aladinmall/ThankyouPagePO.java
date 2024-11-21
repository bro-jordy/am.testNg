package pageobject.Aladinmall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class ThankyouPagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public ThankyouPagePO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    @FindBy(id = "3")
    private WebElement buttonLihatTransaksi;

    @FindBy(id = "4")
    private WebElement buttonKembali;

    @FindBy(xpath = "//*[contains(text(), \'Selesaikan pembayaran dalam\')]")
    private WebElement textCountdown;

    @FindBy(xpath = "//*[contains(text(), \'Silakan melakukan pembayaran. Pesanan kamu akan diproses setelah pembayaran diterima.\')]")
    private WebElement textLakukanPembayaran;


    /**
     * Get text Button Lihat Transaksi
     */
    public String getTextButtonLihatTransaksi() {
       return selenium.getText(buttonLihatTransaksi);
    }

    /**
     * Get text Button Kembali
     */
    public String getTextButtonKembali() {
        return selenium.getText(buttonKembali);
    }

    /**
     * Verify count down is invisible
     */
    public boolean countdownIsVisible() {
        return selenium.isElementAppeared(textCountdown);
    }

    /**
     * Verify selesaikan pembayaran is invisible
     */
    public boolean selesaikanPembayaranIsVisible() {
        return selenium.isElementAppeared(textLakukanPembayaran);
    }



}
