package javaKurs.day09_ternary;

import java.util.Scanner;

public class C10_NestedRakam {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println((sayi<10)?"rakam":(sayi<100)?"iki basamaklı sayi":"uc basamaklı veya daha buyuk sayi");




    }
}
