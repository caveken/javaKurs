package javaKurs.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ilk syıyı giriniz");
        double sayi1=scan.nextDouble();

        System.out.println("Lütfen ikinci syıyı giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayıların çarpımı: " + sayi1*sayi2);

    }
}
