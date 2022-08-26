package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class C07_Soru3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi yazınız");
        String isim=scan.next();


        if (isim.contains("a")&&isim.contains("Z")){
            System.out.println("girdiğiniz isim a ve Z harfi içeriyor");
        }else if (isim.contains("Z")){
            System.out.println("girdiğiniz isim Z harfi içeriyor");
        }else if (isim.contains("a")) {
        System.out.println("girdiğiniz isim a harfi içeriyor");
        }else {
            System.out.println("isminiz a ve Z içermiyor");
        }



    }
}
