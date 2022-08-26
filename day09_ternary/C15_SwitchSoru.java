package javaKurs.day09_ternary;

import java.util.Scanner;

public class C15_SwitchSoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("lütfen 10, 100 veya 1000 sayilerindan birini giriniz");
        int sayi=scan.nextInt();

        switch (sayi) {

            case 10:
                System.out.println("iki basamakli en kucuk sayi");
            break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
            break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("lütfen gecerli bir sayi giriniz");
        }
    }
}
