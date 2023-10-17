Feature: Hepsiburada.com

  Scenario: Trendyol.com Urun Ekleme
    Given Hepsiburada web sitesine git
    When Cerezleri kabul et
    When Arama alanina tikla
    When Urun adini yaz
    When Ara butonuna tikla
    When Filtre icin Bluetooth kulakliklari tikla
    When Filtre icin Apple tikla
    When Listelenen ilk urune tikla
    When Urunu sepete ekle
    Then Sepette urunu kontrol et