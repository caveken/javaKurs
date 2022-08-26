package javaKurs.day17_nestedForLoop;

import java.util.Scanner;

public class C16_WhileLoopSoru6 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayi alın ve bu sayiyi tam bolen sayıları
        ve toplam kac tane olduklarını ekranda yazdırın
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tamsayi giriniz");
        int input = scan.nextInt();

        int bas = 1;


        while (bas <= input) {
            if (input%bas==0) {
                System.out.print(bas+" ");
            }
            bas++;

        }
    }
}
