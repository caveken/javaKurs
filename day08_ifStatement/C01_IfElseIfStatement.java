package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C01_IfElseIfStatement {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir gün ismi giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("salı")) {
            System.out.println("Sal");
        }else if (gun.equals("carsamba")){
            System.out.println("Car");
        }else if (gun.equals("persembe")){
            System.out.println("Per");
        }else if (gun.equals("cuma")){
            System.out.println("Cum");
        }else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        }else if (gun.equals("pazar")){
            System.out.println("Paz");
        }else {
            System.out.println("Lutfengeçerli bir gun ismi giriniz");
        }


    }
}
