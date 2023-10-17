package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrendyolPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("onetrust-accept-btn-handler");

    static By search = By.cssSelector("[placeholder='Aradığınız ürün, kategori veya markayı yazınız']");

    static By searchButton = By.cssSelector(".cyrzo7gC");

    static By bluetoothKulaklik = By.xpath("//div[@class='aggrgtn-cntnr-wrppr']/div[1]/div[@class='fltrs']//div[3]//div[@class='chckbox']");

    static By appleFilter = By.xpath("//div[@class='aggrgtn-cntnr-wrppr']//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div[1]/div[1]//div[.='Apple']");

    static By firstProduct = By.xpath("//div[@class='prdct-cntnr-wrppr']//div[@class='prdct-desc-cntnr']/div[contains(.,'AppleAirpods 2. Nesil Beyaz Bluetooth Kulaklık Mv7n2tu/a ( Apple Türkiye Garanti')]");

    static By add = By.xpath("//div[@class='prdct-cntnr-wrppr']/div[1]//div[@class='btn-basket']//div[@class='add-to-bs-tx']");

    static By cart = By.xpath("//p[.='Sepetim']");

    static By check = By.xpath("//p[@class='pb-item']");



    public TrendyolPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20000));
        this.elementHelper = new ElementHelper(driver);

    }

    public static void AnaSayfa() {
    }

    public static void cerezlerKabul() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search, "airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
        JavascriptExecutor jsx = (JavascriptExecutor)driver; // Selenium sayfayı aşağı kaydırma
        jsx.executeScript("window.scrollBy(0,450)","");
    }

    public static void filterBluetoothKulaklik() {
        elementHelper.click(bluetoothKulaklik);
    }

    public static void filterApple() {
        JavascriptExecutor jsx = (JavascriptExecutor)driver; // Selenium sayfayı aşağı kaydırma
        jsx.executeScript("window.scrollBy(0,450)","");
        elementHelper.click(appleFilter);
    }

    public static void firstProduct()  {
        elementHelper.click(firstProduct);
        JavascriptExecutor jsx = (JavascriptExecutor)driver; // Selenium sayfayı aşağı kaydırma
        jsx.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(cart);

    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
