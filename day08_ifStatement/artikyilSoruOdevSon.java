package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class artikyilSoruOdevSon {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil=scan.nextInt();

        if (yil%4==0) {

            if (yil%100!=0) {
                System.out.println("artik yil değildir");
            }else if (yil%400==0) {
                System.out.println("artik yildir");
            }else {
                System.out.println("artik yil değildir");
            }

        }else {
            System.out.println("artik yil değildir");
        }
    }
}
