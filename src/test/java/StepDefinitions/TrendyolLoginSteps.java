package StepDefinitions;

import Pages.TrendyolLoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TrendyolLoginSteps {

    WebDriver driver = DriverFactory.getDriver();

    TrendyolLoginPages trendyolLoginPages = new TrendyolLoginPages(driver);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        TrendyolLoginPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        TrendyolLoginPages.acceptCookies();
    }

    @When("Click the login tab")
    public void clickTheLoginTab() {
        TrendyolLoginPages.clickLoginTab();
    }

    @When("Click the login field")
    public void clickTheLoginField() {
        TrendyolLoginPages.clickLoginField();
    }

    @When("Write email address")
    public void writeEmailAddress() {
        TrendyolLoginPages.writeEmail();
    }

    @When("Click the password field")
    public void clickThePasswordField() {
        TrendyolLoginPages.clickPasswordField();
    }

    @When("Write password")
    public void writePassword() {
        TrendyolLoginPages.writePassword();
    }

    @When("Click the login button")
    public void clickTheLoginButton() {
        TrendyolLoginPages.clickLoginButton();
    }

    @When("Check the login process")
    public void checkTheLoginProcess() {
        TrendyolLoginPages.checkLogin();
    }
}
