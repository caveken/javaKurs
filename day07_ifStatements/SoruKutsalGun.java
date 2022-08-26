package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class SoruKutsalGun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir gun giriniz");
        String gun=scan.next().toLowerCase();

        if (!(gun.equals("pazartesi")||gun.equals("sali")
        ||gun.equals("carsamba")||gun.equals("persembe")
                ||gun.equals("cuma")||gun.equals("cumartesi")
                ||gun.equals("pazar"))) {
            System.out.println("lütfen geçerli bir gun ismi giriniz");
        } else if (gun.equals("cuma")) {
            System.out.println("müslümanların kutsal günü");
        } else if (gun.equals("cumartesi")) {
            System.out.println("yahudilerin kutsal günü");
        } else if (gun.equals("pazar")){
            System.out.println("hristiyanların kutsal günü");
        } else {
            System.out.println("kutsal bir gün değildir");
        }

    }
}
