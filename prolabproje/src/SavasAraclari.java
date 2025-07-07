// Savas Araclari Classi

public abstract class SavasAraclari implements Cloneable {
    private int seviyepuani = 0; // seviye puanı içerir

    
    // Varsayılan avantajlar
    public int getkaravurusavantaji() {
        return 0; // Varsayılan olarak avantaj yok
    }

    public int getdenizvurusavantaji() {
        return 0; // Varsayılan olarak avantaj yok
    }

    public int gethavavurusavantaji() {
        return 0; // Varsayılan olarak avantaj yok
}














    public SavasAraclari(int seviyepuani) {
        this.seviyepuani = seviyepuani;
    }
    


    public int getseviyepuani() { // getter metodu
        return seviyepuani;
    }

    public void setseviyepuani(int seviyepuani) { // setter metodu
        this.seviyepuani = seviyepuani;
    }

    public void kartpuanigoster() {
        System.out.println("Dayanıklılık: " + getdayaniklilik() + " Seviye puanı: " + getseviyepuani());
    }

    public abstract int getdayaniklilik(); // getter
    public abstract void setdayaniklilik(int dayaniklilik); // setter

    public abstract String getanasinif(); // getter
    public abstract void setanasinif(String anasinif); // setter

    public abstract int getvurusetki(); // getter
    public abstract void setvurusetki(int vurusetki); // setter

    public abstract int DurumGuncelle(int vurusetki);

    @Override
    public SavasAraclari clone() {
        try {
            return (SavasAraclari) super.clone(); // Object sınıfındaki clone() metodunu çağırıyoruz
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null; // Clone işlemi başarısız olursa
 }
}
}