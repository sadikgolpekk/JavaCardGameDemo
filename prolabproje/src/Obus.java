
// Obus Classi

public class Obus extends Karaaraclari {
       
    private int dayaniklilik; // dayaniklilik
    private int vurusetki; // vurus etkisi
    private String altsinif; // su anki sinifi
    private int denizvurusavantaj; // Karaaraclari sinifina ozel denizvurusavantaji
    private int seviyepuani;
    private String anasinif;
 
   public Obus(int dayaniklilik,int seviyepuani,String anasinif,int vurusetki,int denizvurusavantaj,String altsinif){
    super(anasinif,seviyepuani); // üst siniflardan bir ust sinifi ve seviye puanini alir
     this.dayaniklilik=dayaniklilik;
     this.denizvurusavantaj=denizvurusavantaj;
     this.vurusetki=vurusetki;
     this.altsinif=altsinif;
 
   }


   @Override
   public SavasAraclari clone() {
   
    return new Obus(this.dayaniklilik, this.seviyepuani, this.anasinif, this.vurusetki,this.denizvurusavantaj, this.altsinif);

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
    public int getdenizvurusavantaji() {
        return denizvurusavantaj;
    }

    @Override
    public void setdenizvurusavantaji(int denizvurusavantaji) {
        this.denizvurusavantaj = denizvurusavantaji;
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
