package javaKurs.day03_scanner;

import java.util.Scanner;

public class C10_ScannerSoru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunluğunu giriniz");
        int a=scan.nextInt();
        System.out.println("Karenin çevre uzunluğu: " + (a*4));
        System.out.println("Karenin alanı: " + (a*a));
    }
}
