package javaKurs.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String kullaniciIsmi=scan.next();
        System.out.println("İsminiz: "+kullaniciIsmi);




    }
}
