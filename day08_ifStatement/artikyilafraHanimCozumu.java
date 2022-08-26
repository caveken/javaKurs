package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class artikyilafraHanimCozumu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil = scan.nextInt();


        if (yil % 4 != 0) {
            System.out.println("Artik yil degildir");
        }else if (yil%100!=0){
            System.out.println("Artik yil degil");
        }else if (yil%400==0) {
            System.out.println("Artik yil");
        }else {
            System.out.println("artik yil degildir");
        }
    }
}
