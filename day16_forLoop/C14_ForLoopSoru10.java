package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C14_ForLoopSoru10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("1. sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("2. sayiyi giriniz");
        int sayi2= scan.nextInt();

        int toplam=0;


        if (sayi1>=sayi2) {

            for (int i = sayi2; i <=sayi1 ; i++) {

                toplam+=i;

            }
            System.out.println(toplam);

        } else if (sayi1<=sayi2) {
            for (int i = sayi1; i<=sayi2; i++) {

                toplam += i;

            }
            System.out.println(toplam);
        }


    }
}
