package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class ArtikYilMehmetHocaCozum {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil=scan.nextInt();


        if (yil%100==0) {

            if (yil%400==0) {
                System.out.println("artik yil");
            }else {
                System.out.println("artik yil değil");
            }

        }else if (yil%4==0) {
            System.out.println("artik yil");
        }else {
            System.out.println("artik yil değil");
        }
    }
}
