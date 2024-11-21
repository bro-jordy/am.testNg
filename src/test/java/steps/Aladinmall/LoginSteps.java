package steps.Aladinmall;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobject.Aladinmall.LoginPO;
import utilities.ThreadManager;

public class LoginSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private LoginPO login = new LoginPO(driver);

    @And("user input email or phone number {string}")
    public void user_input_email(String Email) throws InterruptedException{
        login.inputEmail(Email);
        login.clickOnNextButton();
    }

    @And("user input password {string}")
    public void user_input_password(String Password) throws InterruptedException{
        login.inputPassword(Password);
        login.clickOnNextButton();
    }

    @And("user input email {string} and password {string}")
    public void input_email_password(String username,String password) throws InterruptedException {
        login.inputEmail(username);
        login.clickOnNextButton();
        login.inputPassword(password);
        login.clickOnNextButton();
    }
}
