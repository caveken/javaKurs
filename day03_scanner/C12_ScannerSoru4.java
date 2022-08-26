package javaKurs.day03_scanner;

import java.util.Scanner;

public class C12_ScannerSoru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("dikdörtgen prizmanın uzun kenar, kısa kenar ve yüksekliğini giriniz");

        double u=scan.nextDouble();
        double k=scan.nextDouble();
        double h=scan.nextDouble();

        System.out.println("dikdörtgen prizmanın hacmi: " + u*k*h+"cm³");
    }
}
