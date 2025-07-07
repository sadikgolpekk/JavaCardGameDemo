import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class oyun {


    public static void main(String[] args) {

        List<SavasAraclari> tumKartlar = new ArrayList<>(); // tüm Kartlar,seviye puani 20'yi gectigi zaman olusacak
        List<SavasAraclari> acikkartlar=new ArrayList<>(); // acik kartlar
               
     
        acikkartlar.add(new Ucak(20, 0, "Hava", 10, 10, "Ucak"));
        acikkartlar.add(new Obus(20, 0, "Kara", 10, 5, "Obus"));
        acikkartlar.add(new Fırkateyn(25, 0, "Deniz", 10, 5, "Firkateyn"));

        // Hava Araçları
        tumKartlar.add(new Ucak(20, 0, "Hava", 10, 10, "Ucak"));
        tumKartlar.add(new Siha(15, 0, "Hava", 10, 10, 10, "Siha"));
       
        // Kara Araçları
        tumKartlar.add(new Obus(20, 0, "Kara", 10, 5, "Obus"));
        tumKartlar.add(new Kfs(10, 0, "Kara", 10, 10, 20, "KFS"));

        // Deniz Araçları
        tumKartlar.add(new Fırkateyn(25, 0, "Deniz", 10, 5, "Firkateyn"));
        tumKartlar.add(new Sida(15, 0, "Deniz", 10, 10, 10, "Sida"));


        // Kartları rastgele dağıt
        List<SavasAraclari> Kartlar = kartDagit(acikkartlar); // Kart dağıt fonksiyonu ile kartları dağıtır
        List<SavasAraclari> turkartlar= new ArrayList<>(Kartlar);
      

        int girdi;
      Scanner scanner=new Scanner(System.in);

       
       Logger.log("Oyununuzun Kaç adım olmasını istiyorsunuz: ");

        girdi=scanner.nextInt();

       // Kullanıcının Kart Seçmesi
       List<SavasAraclari> secilenKartOyuncu = kullaniciKartSec(turkartlar,Kartlar); // karılmış kartlar
        List<SavasAraclari> Kartlar2 = kartDagit(acikkartlar); // Kart dağıt fonksiyonu ile kartları dağıtır
        List<SavasAraclari> turkartlar2= new ArrayList<>(Kartlar2);
   

        // Bilgisayarın Kart Seçmesi

       List<SavasAraclari> secilenKartBilgisayar = bilgisayarKartSec(turkartlar2,Kartlar2); // karılmış kartlar

      Logger.log("---------------------------");
      Logger.log("Kartlar seçildi..."); 

        // Kartları yazdırma
        Logger.log("Sectiğimiz Oyuncu Kartları:");
        yazdirKartlar(secilenKartOyuncu);

        Logger.log("Seçilen Bilgisayar Kartları:");
        yazdirKartlar(secilenKartBilgisayar);

    
        


        // Kart kapışması ve dayanıklılık güncelleme
        SavasAraclari kartBilgisayar;
        SavasAraclari kartOyuncu;

        
        int oyuncuseviyepuani=0;
        int bilgisayarseviyepuani=0;

    for(int x=0;x<girdi;x++){
        Logger.log(" Oyun basliyor...\n");
        Logger.log(x+1+".HAMLE");
            
      

        for (int a = 0; a < 3; a++) {
            kartOyuncu = secilenKartOyuncu.get(a);
            kartBilgisayar = secilenKartBilgisayar.get(a);
        
            
          

            // Oyuncu ve bilgisayar arasındaki mücadele
           
            Logger.log(kartBilgisayar.getClass().getSimpleName()+" vs " + kartOyuncu.getClass().getSimpleName());

            kartBilgisayar.DurumGuncelle(kartOyuncu.getvurusetki());

            // Bilgisayar kartı oyuncunun kartına vuruyor
            kartOyuncu.DurumGuncelle(kartBilgisayar.getvurusetki());

            
            Logger.log("");
        }


    for(int a=0;a<3;a++){ // bilgisayar icin
        if(secilenKartBilgisayar.get(a).getdayaniklilik()<=0){
             oyuncuseviyepuani++;
            for(int b=0;b<Kartlar2.size();b++){
             if(secilenKartBilgisayar.get(a)==Kartlar2.get(b)){
                Kartlar2.remove(b);
                Logger.log("bilgisayar "+secilenKartBilgisayar.get(a).getClass().getSimpleName()+" elendi");
             
                break;
             }  
        

        }  
    } 
            
        else{
            Logger.log("Bilgisayar "+secilenKartBilgisayar.get(a).getClass().getSimpleName() +" yeni dayanıklılık: " + secilenKartBilgisayar.get(a).getdayaniklilik());
           }


          
           
       }



       for(int a=0;a<3;a++){ // oyuncu icin
     
        if(secilenKartOyuncu.get(a).getdayaniklilik()<=0){
               bilgisayarseviyepuani++;
            for(int b=0;b<Kartlar.size();b++){
            
             if(secilenKartOyuncu.get(a)==Kartlar.get(b)){
                Kartlar.remove(b); 
                Logger.log("oyuncu "+secilenKartOyuncu.get(a).getClass().getSimpleName()+" elendi");  
               
                break;
             }  

        }  
    } 
            
        else{
            Logger.log("Oyuncu "+secilenKartOyuncu.get(a).getClass().getSimpleName()+" yeni dayanıklılık: " + secilenKartOyuncu.get(a).getdayaniklilik());
           }
          
       }

     

       SavasAraclari ekleoyuncu=kartekle(acikkartlar,tumKartlar,oyuncuseviyepuani);
       Kartlar.add(ekleoyuncu); // hem ana kartimiza
       turkartlar.add(ekleoyuncu); // hem de azalan kartimiza
       Logger.log("\n");
       Logger.log("----------------------------------");
       Logger.log("\n");
            for(int a=0;a<Kartlar.size();a++){
                Logger.log("oyuncu kartları: "+Kartlar.get(a).getClass().getSimpleName());
         
            }

            Logger.log("\n");

   secilenKartOyuncu=kullaniciKartSec(turkartlar,Kartlar);
   
   SavasAraclari eklebilgisayar=kartekle2(acikkartlar,tumKartlar,bilgisayarseviyepuani);
   Kartlar2.add(eklebilgisayar); // hem ana kartimiza
   turkartlar2.add(eklebilgisayar); // hem de azalan kartimiza

   secilenKartBilgisayar=bilgisayarKartSec(turkartlar2,Kartlar2);
   





 
    
    }

 
int toplamdayaniklilikoyuncu=0;
int toplamdayaniklilikbilgisayar=0;

for(int a=0;a<Kartlar.size();a++){
 toplamdayaniklilikoyuncu=toplamdayaniklilikoyuncu+Kartlar.get(a).getdayaniklilik();
}
for(int b=0;b<Kartlar2.size();b++){
 toplamdayaniklilikbilgisayar=toplamdayaniklilikbilgisayar+Kartlar2.get(b).getdayaniklilik();
}


 
int oyuncuskor=10*oyuncuseviyepuani;
int bilgisayarskor=10*bilgisayarseviyepuani;

Logger.log("oyuncu skor: "+oyuncuskor);
Logger.log("bilgisayar skor: "+bilgisayarskor);

  if(oyuncuskor>bilgisayarskor){

    Logger.log("KAZANAN OYUNCU");
  }
  else if(oyuncuskor<bilgisayarskor){
    Logger.log("KAZANAN BİLGİSAYAR");
  }
  else{
    Logger.log("Skorlar esit,Dayanıklılığa bakılıyor...");
    Logger.log("Toplam bilgisayar dayaniklilik: "+toplamdayaniklilikbilgisayar);
    Logger.log("Toplam oyuncu dayaniklilik: "+toplamdayaniklilikoyuncu);

    if(toplamdayaniklilikoyuncu>toplamdayaniklilikbilgisayar){
        Logger.log("oyuncu skor: "+oyuncuskor);
        Logger.log("bilgisayar skor: "+(bilgisayarskor+(toplamdayaniklilikoyuncu-toplamdayaniklilikbilgisayar)));
        Logger.log("KAZANAN OYUNCU");
    }
    else if(toplamdayaniklilikoyuncu<toplamdayaniklilikbilgisayar){
        Logger.log("oyuncu skor: "+oyuncuskor);
        Logger.log("bilgisayar skor: "+(bilgisayarskor+(toplamdayaniklilikbilgisayar-toplamdayaniklilikoyuncu)));
        Logger.log("KAZANAN BİLGİSAYAR");
    }
    else{
        Logger.log("BERABERE");  
    }


  }



    }

    public static SavasAraclari kartekle(List<SavasAraclari> acikkartlar,List<SavasAraclari> tumkartlar,int oyuncuseviyepuani){
       if(oyuncuseviyepuani>=2){
        Random random2=new Random();
        SavasAraclari secilenKartekle = tumkartlar.get(random2.nextInt(tumkartlar.size())).clone();

        return secilenKartekle;
        


       }

   
     else{
        Random random2=new Random();
        SavasAraclari secilenKartekle = acikkartlar.get(random2.nextInt(acikkartlar.size())).clone();

        return secilenKartekle;
    }
}
    
    public static SavasAraclari kartekle2(List<SavasAraclari> acikkartlar,List<SavasAraclari> tumkartlar,int bilgisayarseviyepuani){

        if(bilgisayarseviyepuani>=2){
            Random random2=new Random();
            SavasAraclari secilenKartekle = tumkartlar.get(random2.nextInt(tumkartlar.size())).clone();
    
            return secilenKartekle;
            
    
    
           }
    
       
         else{
            Random random2=new Random();
            SavasAraclari secilenKartekle = acikkartlar.get(random2.nextInt(acikkartlar.size())).clone();
    
            return secilenKartekle;
        }
    }






    // Kartları rastgele dağıtan fonksiyon
    public static List<SavasAraclari> kartDagit(List<SavasAraclari> acikkartlar) {
        List<SavasAraclari> kart = new ArrayList<>();
        Random rand = new Random();
    
        // 6 kart dağıtılacak
        for (int i = 0; i < 6; i++) {
            // Rastgele bir kart seç
            SavasAraclari secilenKart = acikkartlar.get(rand.nextInt(acikkartlar.size())).clone();//buraya aldım
            kart.add(secilenKart);//clone buradaydı
        }

        return kart;
    }




    // Kartları yazdıran fonksiyon
    public static void yazdirKartlar(List<SavasAraclari> kartlar) {
        for (int i = 0; i < kartlar.size(); i++) {
            SavasAraclari kart = kartlar.get(i);
            Logger.log((i + 1) + ". " + kart.getClass().getSimpleName());
        }
    }

   








    public static List<SavasAraclari> bilgisayarKartSec(List<SavasAraclari> turkartlar2,List<SavasAraclari> Kartlar2) {
        List<SavasAraclari> secilenKartlar = new ArrayList<>();
        Random rand = new Random();
      
         int kartSayisi=turkartlar2.size();
       
         if(turkartlar2.size()==1){
            Logger.log("1 e girer oyun biter");
         }
    

       else if(turkartlar2.size()==2){

        
        
        int index = rand.nextInt(Kartlar2.size());  // Bu sayede, kart sayısına göre geçerli bir index alırız
         
        while(Kartlar2.get(index)==turkartlar2.get(0) || Kartlar2.get(index)==turkartlar2.get(1)){
            Logger.log(" Bilgisayar Bir kere daha giriniz");
            index=rand.nextInt(Kartlar2.size());

        }
        
        
        turkartlar2.add(Kartlar2.get(index).clone());
         
        
         secilenKartlar.add(turkartlar2.get(2));
          SavasAraclari secilenKart = turkartlar2.get(2);
    
         secilenKartlar.add(turkartlar2.get(0));
         secilenKartlar.add(turkartlar2.get(1));
          secilenKartlar.add(secilenKart);
        
    
      } 
    
       else{
        
       
    
        // 3 rastgele kart seçelim
        for (int i = 0; i < 3; i++) {
            int index = rand.nextInt(kartSayisi);  // Bu sayede, kart sayısına göre geçerli bir index alırız
            secilenKartlar.add(turkartlar2.get(index));
            turkartlar2.remove(index);  // Aynı kartı tekrar seçmemek için çıkarıyoruz
            kartSayisi--;  // Kalan kart sayısını güncelliyoruz
        }
    
    }
    
        return secilenKartlar;
    }
    



 // Kullanıcının kart seçmesi
 public static List<SavasAraclari> kullaniciKartSec(List<SavasAraclari> turkartlar,List <SavasAraclari> Kartlar) {
       
    List<SavasAraclari> secilenKartlarOyuncu = new ArrayList<>(); // Seçilen kartları tutmak için liste
    // Seçilen 3 kart

     if(turkartlar.size()==1){
        Logger.log("1 e girer,oyun biter");
     }
    

     else if(turkartlar.size()==2){

        Logger.log("Bir kart daha secin ");

            Scanner scanner = new Scanner(System.in);
            
            yazdirKartlar(Kartlar);

        
            int secim1 = scanner.nextInt();
            secim1 = secim1 - 1;  // Index 0'dan başladığı için bir azaltıyoruz
            while(Kartlar.get(secim1)==turkartlar.get(0) || Kartlar.get(secim1)==turkartlar.get(1)){
                Logger.log(" Oyuncu Bir daha giriniz");
                secim1=scanner.nextInt();
                secim1=secim1-1;
            }

            turkartlar.add(Kartlar.get(secim1).clone());


            SavasAraclari secilenKart = turkartlar.get(2);

            // Seçilen kartı listeye ekle
            secilenKartlarOyuncu.add(turkartlar.get(0));
            secilenKartlarOyuncu.add(turkartlar.get(1));
            secilenKartlarOyuncu.add(secilenKart);
             


        
        }

        else{
    for (int i = 0; i < 3; i++) {
        // Kartları yazdır
        Logger.log("Kullanıcı Kart Seçin:");
        for (int j = 0; j < turkartlar.size(); j++) {
            Logger.log((j + 1) + ". " + turkartlar.get(j).getClass().getSimpleName());
        }
      
        // Kullanıcının kart seçmesi
        Scanner scanner = new Scanner(System.in);
        Logger.log("Bir kart seçin (1-" + turkartlar.size() + " arasında bir numara girin): ");
        int secim = scanner.nextInt();
        secim = secim - 1;  // Index 0'dan başladığı için bir azaltıyoruz

        // Seçilen kartı yazdır
        SavasAraclari secilenKart = turkartlar.get(secim);

        // Seçilen kartı listeye ekle
        secilenKartlarOyuncu.add(secilenKart);


        // Kartı listeden çıkarma
        turkartlar.remove(secim); // siliyor.

        
    }
        }


    return secilenKartlarOyuncu;
}
}