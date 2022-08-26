package javaKurs.day03_scanner;

import java.util.Scanner;

public class C14_ScannerSoru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve Soyisminizi yazınız");
        String isim=scan.next();
        String soyisim=scan.next();
        System.out.println("İsim Soyisim : " + isim +" "+soyisim);
    }
}
