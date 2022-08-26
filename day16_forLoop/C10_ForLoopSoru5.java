package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C10_ForLoopSoru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();

        ucunBesinKatlari(sayi);

    }

    private static void ucunBesinKatlari(int sayi) {


        if (sayi>=100){
            System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        }else {

            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0||i%5==0){
                    System.out.print(i+" ");
                }

            }

        }
    }
}
