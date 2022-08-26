package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C08_SoruMaasTeklif {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("lutfen bir maas teklifi giriniz");
        int maas = scan.nextInt();

        if (maas<60000) {
            System.out.println("maalesef kabul edemem");
        }else if (maas<80000) {
            System.out.println("konusabiliriz");
        }else {
            System.out.println("kabul ediyorum");
        }

    }
}
