package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C09_ForLoopSoru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();

        ucunKatlari(sayi);

    }

    private static void ucunKatlari(int sayi) {


        if (sayi>=100){
            System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        }else {

            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i+" ");
                }

            }

        }


    }
}
