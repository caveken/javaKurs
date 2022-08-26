package javaKurs.day06_concatenation;

import java.util.Scanner;

public class C03_Concatenation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(!(7*3>25));

        boolean cevap=7*3>25;
        boolean cevap1=!(7*3>25);
        System.out.println(cevap);//false
        System.out.println(cevap1);//true

        boolean sonuc1= (5+2==7)&&(4+3!=5);
        System.out.println(sonuc1);



    }
}
