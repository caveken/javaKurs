package javaKurs.day18_whileDoWhile;

import java.util.Scanner;

public class C09_WhileLoopSoru5 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girincee kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
        */
        Scanner scan=new Scanner(System.in);
        String sifre="";
        char ilkk='a';
        char sonk='z';
        char ilkb='A';
        char sonb='Z';
        boolean tamammi=false;

        String kucukharfler="";
        String buyukharfler="";

        int kontrol=0;

        while (ilkk<=sonk) {
            kucukharfler=kucukharfler+ilkk;
            ilkk++;
        }

        while (ilkb<=sonb) {
            buyukharfler=buyukharfler+ilkb;
            ilkb++;
        }


        while (!tamammi){
            System.out.println("sifre giriniz");
            sifre= scan.nextLine();

            if (sifre.contains(kucukharfler)) {
                kontrol++;
            } else {
                System.out.println("sifre kucuk harf icermeli");
            }


            if (sifre.contains(buyukharfler)) {
                kontrol++;
            } else {
                System.out.println("sifre buyuk harf icermeli");
            }


            if (sifre.contains("\\W")) {
                kontrol++;
            } else {
                System.out.println("Sifre özel karakter icermeli");
            }


            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }


            if (kontrol==4){ // tum kontrolllerden gecmis demektir
                System.out.println("Sifre basari ile tanimlandi");
                tamammi=true;
            }else{
                kontrol=0;
            }
        }
        System.out.println("Sifreniz kabul edilmistir.");

    }
}
