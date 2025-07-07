// KFS Classi

public class Kfs extends Karaaraclari {
    private int dayaniklilik; // dayaniklilik
    private int vurusetki; // vurus etkisi
    private String altsinif; // su anki sinifi
    private int denizvurusavantaj; // Karaaraclari sinifina ozel denizvurusavantaji
    private int havavurusavantaj; // Kfs sinifina ozel hava vurus avantaji
    private int seviyepuani;
    private String anasinif;
 
   public Kfs(int dayaniklilik,int seviyepuani,String anasinif,int vurusetki,int denizvurusavantaj,int havavurusavantaj,String altsinif){
    super(anasinif,seviyepuani); // üst siniflardan bir ust sinifi ve seviye puanini alir
     this.dayaniklilik=dayaniklilik;
     this.denizvurusavantaj=denizvurusavantaj;
     this.vurusetki=vurusetki;
     this.altsinif=altsinif;
     this.havavurusavantaj=havavurusavantaj;
 
   }


   @Override
   public SavasAraclari clone() {
   
    return new Kfs(this.dayaniklilik, this.seviyepuani, this.anasinif, this.vurusetki,this.denizvurusavantaj,this.havavurusavantaj, this.altsinif);

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

    public int gethavavurusavantaji() {
        return havavurusavantaj;
    }

    
    public void sethavavurusavantaji(int havavurusavantaji) {
        this.havavurusavantaj = havavurusavantaji;
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
