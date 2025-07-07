public abstract class Karaaraclari extends SavasAraclari{
    private String anasinif="Kara"; // su anki sinifi gosterir
    
    public Karaaraclari(String anasinif,int seviyepuani){
    super(seviyepuani); // ust siniftan seviyepuani ozelligini alir
    this.anasinif=anasinif;
    }

    
    public String getanasinif(){
        return anasinif;
    }
    public void setanasinif(String anasinif){
      this.anasinif=anasinif;
    }

    public abstract int getdayaniklilik(); // getter
    public abstract void setdayaniklilik(int dayaniklilik); // setter

    public abstract int getvurusetki(); // getter
    public abstract void setvurusetki(int vurusetki); // setter

    public abstract String getaltsinif();
    public abstract void setaltsinif(String altsinif);

    public abstract int getdenizvurusavantaji();
    public abstract void setdenizvurusavantaji(int denizvurusavantaj);



    @Override
    public void kartpuanigoster() {
        System.out.println("Altsınıf: " + getaltsinif() + ", Seviye Puanı: " + getseviyepuani() + ", Kara Vuruş Avantajı: " + getdenizvurusavantaji());
    }

    
  



}
