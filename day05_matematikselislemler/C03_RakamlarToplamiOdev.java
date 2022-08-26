package javaKurs.day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplamiOdev {
    public static void main(String[] args) {
        /*
        kullanıcıdan 4 basamaklı bir sayı alın
        ve rakamları toplamını bulup yazdırın
        -rakamlar toplamı:rtop
        -girilen sayi:gs

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Dört Basamaklı Pozitif bir sayı giriniz");
        int sayi=scan.nextInt();

        int rtop=0;
        int gs=sayi;
        //****
        rtop=sayi%10;
        sayi/=10;

        //***

        rtop=sayi%10+rtop;
        sayi/=10;

        //**

        rtop=sayi%10+rtop;
        sayi/=10;

        //*

        rtop=sayi%10+rtop;
        sayi/=10;

        //0

        System.out.println(gs+" Sayısının Rakamları Toplamı: "+rtop);





    }
}
