package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class C08_Soru4 {
    public static void main(String[] args) {

        /*
        kullanıcıdan isim ve soyisimisteyin
        hangisinin daha uzun olduğunu yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi yazınız");
        String isim=scan.nextLine();
        System.out.println("Soyisminizi yazınız");
        String soyisim=scan.nextLine();


        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        }else if (isim.length()<soyisim.length()) {
            System.out.println("soyisminiz isminizden daha uzun");
        }else {
            System.out.println("isminiz ve soyisminiz eşit uzunlukta");
        }

        //soruya birde isim ve soyismin eşit olması durumunu ekledim

    }
}
