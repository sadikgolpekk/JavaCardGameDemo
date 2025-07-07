// Fırkateyn Classi
  

public class Fırkateyn extends Denizaraclari {
    private int dayaniklilik; // dayaniklilik
    private int vurusetki; // vurus etkisi
    private String altsinif; // su anki sinifi dondurur
    private int havavurusavantaj; // Deniz araclari sinifina ozel havavurus avantaji
    private int seviyepuani;
    private String anasinif;
 
   public Fırkateyn(int dayaniklilik,int seviyepuani,String anasinif,int vurusetki,int havavurusavantaj,String altsinif){
    super(anasinif,seviyepuani); // ust siniflardan anasinif ve seviyepuani ozelligini alir
     this.dayaniklilik=dayaniklilik;
     this.havavurusavantaj=havavurusavantaj;
     this.vurusetki=vurusetki;
     this.altsinif=altsinif;
 
   }

   @Override
   public SavasAraclari clone() {
   
    return new Fırkateyn(this.dayaniklilik, this.seviyepuani, this.anasinif, this.vurusetki,this.havavurusavantaj, this.altsinif);

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

   @Override
   public int gethavavurusavantaji() {
       return havavurusavantaj;
   }

   @Override
   public void sethavavurusavantaji(int havavurusavantaji) {
       this.havavurusavantaj = havavurusavantaji;
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
