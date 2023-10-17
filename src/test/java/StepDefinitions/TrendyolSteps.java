package StepDefinitions;

import Pages.TrendyolPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TrendyolSteps {

    WebDriver driver = DriverFactory.getDriver();
    TrendyolPages hepsiburadaPages = new TrendyolPages(driver);

    @Given("Hepsiburada web sitesine git")
    public void hepsiburadaWebSitesineGit() {
        TrendyolPages.AnaSayfa();
    }

    @When("Cerezleri kabul et")
    public void cerezleriKabulEt() {
        TrendyolPages.cerezlerKabul();
    }

    @When("Arama alanina tikla")
    public void aramaAlaninaTikla() {
        TrendyolPages.clickSearch();
    }

    @When("Urun adini yaz")
    public void urunAdiniYaz() {
        TrendyolPages.writeProduct();
    }

    @When("Ara butonuna tikla")
    public void araButonunaTikla() {
        TrendyolPages.searchButton();
    }

    @When("Filtre icin Bluetooth kulakliklari tikla")
    public void filtreIcinBluetoothKulakliklariTikla() {
        TrendyolPages.filterBluetoothKulaklik();
    }

    @When("Filtre icin Apple tikla")
    public void filtreIcinAppleTikla() {
        TrendyolPages.filterApple();
    }

    @When("Listelenen ilk urune tikla")
    public void listelenenIlkUruneTikla() {
        TrendyolPages.firstProduct();
    }

    @When("Urunu sepete ekle")
    public void urunuSepeteEkle() {
        TrendyolPages.addCart();
    }

    @Then("Sepette urunu kontrol et")
    public void sepetteUrunuKontrolEt() {
        TrendyolPages.checkCart();
    }
}
