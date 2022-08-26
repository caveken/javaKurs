package javaKurs.day09_ternary;

import java.util.Scanner;

public class C16_SwitchSoru {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("lütfen SDET kısaltmasındaki harflerden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);


        switch (harf) {

            case 'S':
                System.out.println("SoftWare");
                break;
            case 'D':
                System.out.println("Devoloper");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            default:
                System.out.println("lutfen gecerli bir karakter giriniz");

        }


    }
}
