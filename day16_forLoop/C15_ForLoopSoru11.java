package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C15_ForLoopSoru11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 dahil 10 dan kucuk bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        int faktoryel=1;

        if (sayi<=10) {

            for (int i = 1; i <= sayi; i++) {

                faktoryel *= i;
            }
            System.out.println(faktoryel);
        }else System.out.println("lutfen istenilen aralikta bir deger giriniz");
    }
}
