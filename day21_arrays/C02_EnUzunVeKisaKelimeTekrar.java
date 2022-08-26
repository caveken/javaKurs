package javaKurs.day21_arrays;

public class C02_EnUzunVeKisaKelimeTekrar {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] kelimeler ={"ekran", "fare", "klavye", "bilgisayar", "harddisk", "anakart"};

        enUzunVeKisaKelimeBul(kelimeler);

    }

    public static void enUzunVeKisaKelimeBul(String[] kelimeler) {

        String enUzun=kelimeler[0];
        String enKisa=kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length()>enUzun.length()){
                enUzun=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisa.length()){
                enKisa=kelimeler[i];
            }

        }
        System.out.println("en uzun kelime: "+enUzun);
        System.out.println("en kısa kelime: "+enKisa);
    }
}
