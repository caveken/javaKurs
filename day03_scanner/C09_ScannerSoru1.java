package javaKurs.day03_scanner;

import java.util.Scanner;

public class C09_ScannerSoru1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz\naralarda enter tuşuna basınız");
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.println("x+y:"+(x+y)+" x-y:"+(x-y)+" x*y:"+(x*y));

    }
}
