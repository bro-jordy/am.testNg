package pageobject.Aladinmall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class LoginPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPO(WebDriver driver){
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

    @FindBy(xpath = "//*[@type=\"email\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@type=\"password\"]")
    private WebElement inputPassword;

    @FindBy(id = "1")
    private WebElement nextButton;

    /**
     * Enter phone number
     * @param Email
     */
    public void inputEmail(String Email) {
        selenium.enterText(inputEmail, Email, true);
    }

    /**
     * Enter phone number
     * @param Password
     */
    public void inputPassword(String Password) {
        selenium.enterText(inputPassword, Password, true);
    }

    /**
     * Click on selanjutnya button
     * @throws InterruptedException
     */
    public void clickOnNextButton() throws InterruptedException {
        selenium.clickOn(nextButton);
    }
}
