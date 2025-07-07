// Oyuncu Classi

import java.util.List;

public class oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    private List<SavasAraclari> kartListesi;

    // Parametreli Yapıcı
    public oyuncu(int oyuncuID, String oyuncuAdi, int skor, List<SavasAraclari> kartListesi) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
        this.kartListesi = kartListesi;
    }

    // Parametresiz Yapıcı
    public oyuncu() {
        this.oyuncuID = 0; // Varsayılan oyuncuID
        this.oyuncuAdi = "Bilinmeyen"; // Varsayılan oyuncuAdi
        this.skor = 0; // Varsayılan skor
        this.kartListesi = null; // Varsayılan kartListesi
    }

    // Skor gösterme fonksiyonu
    public void SkorGoster() {
        System.out.println(oyuncuAdi + " Skoru: " + skor);
    }

    // Getter ve Setter'lar
    public int getOyuncuID() {
      return oyuncuID;
  }

  public void setOyuncuID(int oyuncuID) {
      this.oyuncuID = oyuncuID;
  }

  public String getOyuncuAdi() {
      return oyuncuAdi;
  }

  public void setOyuncuAdi(String oyuncuAdi) {
      this.oyuncuAdi = oyuncuAdi;
  }

  public int getSkor() {
      return skor;
  }

  public void setSkor(int skor) {
      this.skor = skor;
  }

  public List<SavasAraclari> getKartListesi() {
      return kartListesi;
  }

  public void setKartListesi(List<SavasAraclari> kartListesi) {
      this.kartListesi = kartListesi;
  }


    // Kart seçme fonksiyonu
    
}