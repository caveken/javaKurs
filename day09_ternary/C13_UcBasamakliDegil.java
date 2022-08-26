package javaKurs.day09_ternary;

import java.util.Scanner;

public class C13_UcBasamakliDegil {
    public static void main(String[] args) {


        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println((sayi>99)?"uc basamakli":"uc basamakli degil");




    }
}
