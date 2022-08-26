package javaKurs.day14_methodCreation;

import java.util.Scanner;

public class deneme_tarih_sehir {
    public static void main(String[] args) {
        //kullanıcıdan sehir ismini ve doğum tarihini alıp
        //bunları pragramda kullanacağımız formatta bize döndüren bir metod olusturun
        //sehir ismini programimizda buyk hrf olarak
        //tarihi 2022-06-30 seklinde kullanmak istiyoruz


        String tarih=tarihAll();
        String sehir=sehirAll();

        System.out.println(tarih+"\n"+sehir);



    }

    private static String sehirAll() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sehir giriniz");
        String il=scan.next().toUpperCase();

        return il;

    }

    private static String tarihAll() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizi \nyıl(örn.1975), \nay(örn.11), " +
                "\ngun(örn.21) \nsırası ile giriniz\naralarda enter tusuna basınız");
        int yil=scan.nextInt();
        int ay=scan.nextInt();
        int gun=scan.nextInt();

        String sonuc="";

        if (ay<10||gun<10){
            sonuc=yil+"-"+"0"+ay+"-"+"0"+gun;
        }else if ((yil<1900||yil>2100)||(ay<=0||ay>12)||(gun<1||gun>31)){
        System.out.println("lutfen gecerli bir aralık giriniz\nyil(1900-2100), ay(1-12), gun(1-31),");
        }else {
            sonuc=yil+"-"+ay+"-"+gun;
        }
        return sonuc;




    }
}
