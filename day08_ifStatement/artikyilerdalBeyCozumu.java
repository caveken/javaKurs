package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class artikyilerdalBeyCozumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil = scan.nextInt();

        if (yil % 4 != 0) {
            System.out.println("Artik yil degil");
        } else if (yil % 100 == 0 && yil % 400 != 0) {
            System.out.println("Artik yil degil");

            }else{
                System.out.println("Artik yil");
        }
    }
}
