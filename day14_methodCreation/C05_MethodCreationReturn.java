package javaKurs.day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        //kullanıcıdan sehir ismini ve doğum tarihini alıp
        //bunları pragramda kullanacağımız formatta bize döndüren bir metod olusturun
        //sehir ismini programimizda buyk hrf olarak
        //tarihi 2022-06-30 seklinde kullanmak istiyoruz




        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println(sehir);
        System.out.println(tarih);





    }

    public static String tarihAl() {

        String tarih="";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinin yilini giriniz");
        int yil=scan.nextInt();

        if (yil<1900||yil>2100){
            System.out.println("Lutfen gecerli bir yil giriniz");
        }else
            tarih=yil+"-";

        System.out.println("Lutfen 1-12 arasında bir ay giriniz");
        int ay=scan.nextInt();
        if (ay<=0||ay>12){
            System.out.println("Lutfen 1-12 arasında bir sayi giriniz");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else tarih=tarih+ay+"-";

        System.out.println("Lutfen 1-31 arasında bir gun giriniz");
        int gun=scan.nextInt();
        if (gun<=0||gun>31){
            System.out.println("Lutfen 1-31 arasında bir sayi giriniz");
        }else if (gun<10){
            tarih=tarih+"0"+gun;
        }else tarih=tarih+gun;

        return tarih;



    }

    public static String sehirAl() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String il=scan.next().toUpperCase();



        return il;


    }
}
