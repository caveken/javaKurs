package javaKurs.day09_ternary;

import java.util.Scanner;

public class C09_SoruTekCift {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println((sayi%2==0)?"sayi cift":"sayi tek");



    }
}
