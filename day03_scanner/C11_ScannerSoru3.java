package javaKurs.day03_scanner;

import java.util.Scanner;

public class C11_ScannerSoru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz");
        double yariCap=scan.nextDouble();
        double pi=3.141592653589793;
        System.out.println("çemberin çevresi: " + (2*pi*yariCap));
        System.out.println("çemberin çevresi: " + (pi*yariCap*yariCap));


    }
}
