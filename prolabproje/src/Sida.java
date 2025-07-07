
// Sida Classi

public class Sida extends Denizaraclari {
    private int dayaniklilik; // dayaniklilik
    private int vurusetki; // vurusetki 
    private String altsinif; // su anki sinifi
    private int karavurusavantaj; // Sida sinifina ozel karavurus avantaji
    private int havavurusavantaj;  // Deniz araclari sinifina ozel havavurus avantaji
    private int seviyepuani;
    private String anasinif;
 
   public Sida(int dayaniklilik,int seviyepuani,String anasinif,int vurusetki,int havavurusavantaj,int karavurusavantaj,String altsinif){
    super(anasinif,seviyepuani); // ust siniflardan anasinif ve seviyepuani ozellikleri alinir
     this.dayaniklilik=dayaniklilik;
     this.havavurusavantaj=havavurusavantaj;
     this.vurusetki=vurusetki;
     this.karavurusavantaj=karavurusavantaj;
     this.altsinif=altsinif;
    
 
   }

   @Override
   public SavasAraclari clone() {
   
    return new Sida(this.dayaniklilik, this.seviyepuani, this.anasinif, this.vurusetki,this.havavurusavantaj, this.karavurusavantaj, this.altsinif);

}



   @Override
    public int getdayaniklilik() {
        return dayaniklilik;
    }

    @Override
    public void setdayaniklilik(int dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    @Override
    public int getvurusetki() {
        return vurusetki;
    }

    @Override
    public void setvurusetki(int vurusetki) {
        this.vurusetki = vurusetki;
    }

    @Override
    public String getaltsinif() {
        return altsinif;
    }

    @Override
    public void setaltsinif(String altsinif) {
        this.altsinif = altsinif;
    }

   
    public int getkaravurusavantaji() {
        return karavurusavantaj;
    }


    public void setkaravurusavantaji(int karavurusavantaji) {
        this.karavurusavantaj = karavurusavantaji;
    }



    @Override
    public int gethavavurusavantaji() {
        return havavurusavantaj;
    }

    @Override
    public void sethavavurusavantaji(int havavurusavantaji) {
        this.havavurusavantaj = havavurusavantaji;
    }

    // Durum güncelleme metodu
    
    public int DurumGuncelle(int vurus) {
        this.dayaniklilik -= vurus;  // Dayanıklılığı vuruş kadar azaltma işlemi
        System.out.println("Durum güncelleniyor: " + vurus + " kadar vuruldu.");
   
        if(this.dayaniklilik<=0){
            if(this.dayaniklilik<0){
                this.dayaniklilik=0;
            }
            System.out.println("kart öldü");
            return 1; // oyuncu  karti cikarilir
           }
    
           return 0;  // oyuncu karti cikarilmaz

    }









 

} 