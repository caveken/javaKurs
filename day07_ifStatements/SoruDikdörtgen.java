package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class SoruDikdörtgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dikdortgenin birbirine dik iki kenar uzunluklarini giriniz\naralarda enter tuşuna basınız");
        double kenar1=scan.nextDouble(),
                kenar2=scan.nextDouble();

        if (kenar1==kenar2) {
            System.out.println("girmis oldugunuz kenar uzunlukları bir kareye aittir");
        } else {
            System.out.println("girmişolduğun değerler kareye ait değildir");
        }
    }
}
