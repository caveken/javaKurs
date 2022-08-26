package javaKurs.day09_ternary;

import java.util.Scanner;

public class C08_SoruBuyukOlmayanSayi {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("lütfen iki adet sayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

       // System.out.println((sayi1<sayi2)?sayi1:(sayi2<sayi1)?sayi2:sayi1);

        System.out.println((sayi1<sayi2)?sayi1:sayi2);

    }
}
