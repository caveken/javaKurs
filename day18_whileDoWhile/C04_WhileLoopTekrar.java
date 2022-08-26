package javaKurs.day18_whileDoWhile;

import java.util.Scanner;

public class C04_WhileLoopTekrar {
    public static void main(String[] args) {
        /*
          Kullanicidan tam sayilar alin
          kullanici cift sayi girdigi muddetce sayiyilari yazdirin
          tek sayi girdiginde islemi bitirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        while (sayi%2==0) {
            System.out.println("lutfen bir tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("girilen sayi cift: "+sayi);
            }else System.out.println("girilen sayi cift degil tek sayi");
        }



        do {
            System.out.println("lutfen bir tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("girilen sayi cift: "+sayi);
            }else System.out.println("girilen sayi cift degil tek sayi");

        }while (sayi%2==0);


    }
}
