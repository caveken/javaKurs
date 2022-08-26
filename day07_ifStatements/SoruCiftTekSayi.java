package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class SoruCiftTekSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi çifttir");
        } else {
            System.out.println("sayi tektir");
        }

    }
}
