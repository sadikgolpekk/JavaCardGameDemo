# Savaş Araçları Kart Oyunu

Bu proje, nesne yönelimli programlama (OOP) prensiplerine dayalı olarak Java dilinde geliştirilmiş bir savaş araçları kart oyunudur. Oyuncu ve bilgisayar, belirli kategorilerdeki (hava, kara, deniz) savaş araçları kartlarını seçerek stratejik karşılaşmalar yapar. Oyunun amacı, stratejik kararlarla rakibe üstünlük sağlamaktır.

![Image](https://github.com/user-attachments/assets/ee9c33c4-5fd3-4018-820b-e887c62a321e)

## Özellikler

- **Nesne Yönelimli Tasarım**: 
  - Kalıtım, kapsülleme ve çok biçimlilik (polymorphism) gibi temel OOP prensipleri kullanılmıştır.
  - Sınıflar ve nesneler, oyun öğelerini ve ilişkilerini temsil eder.
- **Savaş Mekaniği**:
  - Oyuncular ve bilgisayar başlangıçta kartlarını seçer.
  - Oyun sırasında hamleler yapılır, kartlar karşılaştırılır ve kazanan belirlenir.
  - Belirli bir puana ulaşan taraflar yeni kartlara erişebilir.
- **Terminal Tabanlı Arayüz**:
  - Oyun metin tabanlı bir arayüz üzerinden oynanır.
  - Oyuncuların hamleleri ve oyunun durumu terminalde görüntülenir.
- **Dosya Kayıt Sistemi**:
  - Her hamle ve sonuç, bir .txt dosyasına kaydedilir.

## Teknik Bilgiler

- **Programlama Dili**: Java


- **Kullanılan Yapılar**:
  - Abstract sınıflar: `SavasAraclari`, `KaraAraclari`, `HavaAraclari`, `DenizAraclari`
  - Özelleştirilmiş sınıflar: `Ucak`, `Siha`, `Obus`, `KFS`, `Firkateyn`, `Sida`
- **Sınıf İlişkileri**:
  - UML diyagramları proje dokümantasyonunda mevcuttur.
  - Tüm savaş araçları `SavasAraclari` sınıfından türetilmiştir.
- **Rastgele Kart Seçimi**:
  - Bilgisayar kart seçimlerini rastgele yapar.

![Image](https://github.com/user-attachments/assets/16bd2fb5-49e3-4a31-a0dc-169cd7a04dba)


## Kurulum

1. **Java Yükleyin**:
   - JDK sürüm 11 veya üzeri gereklidir.
2. **Proje Dosyalarını İndirin**:
   - Kodları bu depodan klonlayın veya indirin.
3. **Çalıştırma**:
   - Terminal üzerinden `javac` komutuyla projeyi derleyin ve çalıştırın:
     ```bash
     javac Oyun.java
     java Oyun
     ```

## Yapılacak İyileştirmeler

- **Görselleştirme**: 
  - Swing veya JavaFX kullanılarak görsel bir kullanıcı arayüzü (GUI) eklenebilir.
- **Oyun Mekanikleri**:
  - Bilgisayarın rastgele yerine stratejik seçimler yapması sağlanabilir.

## Geliştiriciler

- **Sadık Gölpek**: Proje mantığının geliştirilmesi ve dosya yönetimi.
  - İletişim: [sadikgolpek@gmail.com](mailto:sadikgolpek@gmail.com)
- **Abdullah Önder**: Sınıf tanımlamaları ve savaş mekaniği.
  - İletişim: [abdullahonder726@gmail.com](mailto:abdullahonder726@gmail.com)

## Lisans

Bu proje açık kaynaklıdır ve MIT Lisansı altında yayımlanmıştır.
