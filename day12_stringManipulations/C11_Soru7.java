package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class C11_Soru7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi yazınız");
        String isim=scan.nextLine();
        System.out.println("soyisminizi yazınız");
        String soyisim=scan.nextLine();
        System.out.println("kredi kartı numaranızı giriniz");
        String kk=scan.nextLine();

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimkalanharf=isim.substring(1).replaceAll("\\w","*");


        String soyIsimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimKalanHarf=soyisim.substring(1).replaceAll("\\w","*");

        String kksondört=kk.substring(14);
        String kkilkoniki="**** **** **** ";

        System.out.println("isim-soyisim : "+isimIlkHarf+isimkalanharf+" "+soyIsimIlkHarf+soyisimKalanHarf);
        System.out.println("kart no : "+kkilkoniki+kksondört);

    }
}
