package javaKurs.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();
        System.out.println("adı soyadı yası = "+isim+" "+soyisim+" "+yas );


    }
}