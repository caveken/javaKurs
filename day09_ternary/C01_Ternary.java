package javaKurs.day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir sayı alın ve sayının mutlak değerini
        yazdırın.
         */


        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0?sayi:(-1*sayi));
    }
}
