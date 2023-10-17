package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrendyolSignupPages {
    
    static WebDriver driver;
    
    static ElementHelper elementHelper;
    
    WebDriverWait wait;

    static By acceptCookie = By.id("onetrust-accept-btn-handler");

    static By loginBar = By.xpath("//p[.='Giriş Yap']");

    static By signupTab = By.xpath("//button[@class='q-secondary q-button-medium q-button tab button right ']");

    static By register = By.id("register-email");

    static By passwordInput = By.id("register-password-input");

    static By gender = By.xpath("//span[.='Erkek']");

    static By clickLightingText = By.cssSelector(".personal-checkbox .ty-check");

    static By robotButton = By.xpath("//div[@class='captcha-box-wrapper']/div[1]/div[1]//iframe[1]");

    static By registerButton = By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']");
    
    
    public TrendyolSignupPages (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30000));
        this.elementHelper = new ElementHelper(driver);
    }


    public static void MainPage() {
    }

    public static void cookie() {
        elementHelper.click(acceptCookie);
    }

    public static void clickLoginBar() {
        elementHelper.click(loginBar);
    }

    public static void clickSignupTab() {
        elementHelper.click(signupTab);
    }

    public static void clickEmailField() {
        elementHelper.click(register);
    }

    public static void writeEposta() {
        elementHelper.sendKey(register, "vafokir881@goflipa.com");
    }

    public static void clickPasswordInput() {
        elementHelper.click(passwordInput);
    }

    public static void writeCode() {
        elementHelper.sendKey(passwordInput, "Okan@2306");
    }

    public static void selectGender() {
        elementHelper.click(gender);
    }

    public static void clickLightingTextCheckbox() {
        elementHelper.click(clickLightingText);

    }

    public static void clickNotrobotCheckbox() {
        elementHelper.click(robotButton);
    }

    public static void clickSignupButton() {
        elementHelper.click(registerButton);
    }



}
