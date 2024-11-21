package steps.Aladinmall;

import io.cucumber.java.en.And;
import io.cucumber.java.en_old.Tha;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobject.Aladinmall.ThankyouPagePO;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class ThankyouSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private ThankyouPagePO Thankyou = new ThankyouPagePO(driver);

    @And("system display thank you page")
    public void thankyou_page() throws InterruptedException {
        Thankyou.countdownIsVisible();
        Assert.assertEquals(Thankyou.getTextButtonLihatTransaksi(), "Lihat Transaksi","Button cannot find");
        Assert.assertEquals(Thankyou.getTextButtonKembali(), "Kembali/Lanjut Belanja","Button cannot find");
//        Assert.assertEquals(Thankyou.selesaikanPembayaranIsVisible(), "Silakan melakukan pembayaran. Pesanan kamu akan diproses setelah pembayaran diterima.", "Text cannot find");
        Thread.sleep(7000);
    }
}
