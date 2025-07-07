// Siha Classi

public class Siha extends Havaaraclari {
    
    private int dayaniklilik; // dayaniklilik
    private int vurusetki; // vurus etkis
    private String altsinif; // su anki sinif
    private int karavurusavantaj; // Havaaraclari sinifinin karavurus avantaji ozelligi
    private int denizvurusavantaj; // Siha sinifinin ozel avantaji
    private int seviyepuani;
    private String anasinif;
 
   public Siha(int dayaniklilik,int seviyepuani,String anasinif,int vurusetki,int denizvurusavantaj,int karavurusavantaj,String altsinif){
    super(anasinif,seviyepuani); // ust siniflardan sinif ve seviye puani ozellikleri alinir
     this.dayaniklilik=dayaniklilik; 
     this.denizvurusavantaj=denizvurusavantaj;
     this.vurusetki=vurusetki;
     this.karavurusavantaj=karavurusavantaj;
     this.altsinif=altsinif;
 
   }

   @Override
   public SavasAraclari clone() {
   
    return new Siha(this.dayaniklilik, this.seviyepuani, this.anasinif, this.vurusetki,this.denizvurusavantaj,this.karavurusavantaj, this.altsinif);

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

    public int getdenizvurusavantaji() {
        return denizvurusavantaj;
    }


    public void setdenizvurusavantaji(int denizvurusavantaji) {
        this.karavurusavantaj = denizvurusavantaji;
    }


    @Override
    public int getkaravurusavantaji() {
        return karavurusavantaj;
    }

    @Override
    public void setkaravurusavantaji(int karavurusavantaji) {
        this.karavurusavantaj = karavurusavantaji;
    }

    // Durum güncelleme metodu
    @Override
    public int DurumGuncelle(int vurus) {
        this.dayaniklilik -= vurus;  // Dayanıklılığı vuruş kadar azaltma işlemi
        System.out.println("Durum güncelleniyor: " + vurus + " kadar vuruldu.");


        if(this.dayaniklilik<=0){

            if(this.dayaniklilik<0){
                this.dayaniklilik=0;
            }



            System.out.println("kart öldü");
            return 1;
           }
    
           return 0;
    
    

    }


 



}
