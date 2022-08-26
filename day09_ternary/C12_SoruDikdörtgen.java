package javaKurs.day09_ternary;

import java.util.Scanner;

public class C12_SoruDikdörtgen {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("lutfen dikdortgenin kısa ve uzun kenarını \nsırası ile giriniz");
        int kisa=scan.nextInt();
        int uzun=scan.nextInt();

        System.out.println((uzun==kisa)?"kare":(uzun>kisa)?"dikdörtgen":"lutfen degerleri sirasi ile giriniz");


    }
}
