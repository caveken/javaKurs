package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class soruUcgenKenar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarini giriniz\naralarda enter tuşuna basınız");
        double a=scan.nextDouble(), b=scan.nextDouble(), c=scan.nextDouble();

        if (a==b&b==c) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("eşkenar değil");
        }
    }



}
