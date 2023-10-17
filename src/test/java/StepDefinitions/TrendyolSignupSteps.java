package StepDefinitions;

import Pages.TrendyolSignupPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TrendyolSignupSteps {

    WebDriver driver = DriverFactory.getDriver();

    TrendyolSignupPages trendyolSignupPages = new TrendyolSignupPages(driver);


    @Given("User is on mainpage")
    public void userIsOnMainpage() {
        TrendyolSignupPages.MainPage();
    }

    @When("Click accept cookie")
    public void clickAcceptCookie() {
        TrendyolSignupPages.cookie();
    }

    @When("Click the login bar")
    public void clickTheLoginBar() {
        TrendyolSignupPages.clickLoginBar();
    }

    @When("Click the sign up tab")
    public void clickTheSignUpTab() {
        TrendyolSignupPages.clickSignupTab();
    }

    @When("Click the email field")
    public void clickTheEmailField() {
        TrendyolSignupPages.clickEmailField();
    }

    @When("Write eposta address")
    public void writeEpostaAddress() {
        TrendyolSignupPages.writeEposta();
    }

    @When("Click the password input")
    public void clickThePasswordInput() {
        TrendyolSignupPages.clickPasswordInput();
    }

    @When("Write passwordcode")
    public void writePasswordcode() {
        TrendyolSignupPages.writeCode();
    }

    @When("Select gender")
    public void selectGender() {
        TrendyolSignupPages.selectGender();
    }

    @When("Click on the lighting text checkbox")
    public void clickOnTheLightingTextCheckbox() {
        TrendyolSignupPages.clickLightingTextCheckbox();
    }

    @When("Click on the notRobot checkbox")
    public void clickOnTheNotRobotCheckbox() {
        TrendyolSignupPages.clickNotrobotCheckbox();
    }

    @When("Click the sign up button")
    public void clickTheSignUpButton() {
        TrendyolSignupPages.clickSignupButton();
    }



}
