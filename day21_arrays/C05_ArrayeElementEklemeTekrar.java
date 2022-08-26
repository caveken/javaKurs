package javaKurs.day21_arrays;

import java.util.Arrays;

public class C05_ArrayeElementEklemeTekrar {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifListesi = {"Sefa Baygül", "Zeynep Ahsen Baygül", "Ahmet Selim Baygul"};
        String eklenecekKisi="Elif Sudem Ergezer";

        sinifListesi=ekleMetod(sinifListesi, eklenecekKisi);

        System.out.println("sinif listesi guncel: "+ Arrays.toString(sinifListesi));
    }

    public static String[] ekleMetod(String[] sinifListesi, String eklenecekKisi) {

        String [] yeniSinifListesi=new String[sinifListesi.length+1];

        for (int i = 0; i < sinifListesi.length ; i++) {

            yeniSinifListesi[i]=sinifListesi[i];

        }
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekKisi;

        return yeniSinifListesi;
    }
}
