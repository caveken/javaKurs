package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Soru3QyaBasincayaKadar {
    public static void main(String[] args) {
        /*
        kullanici Q ya basincaya kadar gireceği isimleri alarak bir liste oluşturup
        bu isimleri bir list olarak bize döndüren bir method olusturun
         */

        List<String> isimlerListesi= new ArrayList<String>(listeOlustur());

        System.out.println("Girilen isimlerin ArrayList: "+isimlerListesi);

    }

    public static List<String> listeOlustur() {

        Scanner scan=new Scanner(System.in);
        String isim;

        List<String>sonuc= new ArrayList<String>();

        do {
            System.out.println("lutfen isim giriniz\ngireceginiz isimler bitince Q harfine basiniz");
            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("Q")){
                sonuc.add(isim);
            }

        }while (!isim.equalsIgnoreCase("Q"));


       return sonuc;
    }
}
