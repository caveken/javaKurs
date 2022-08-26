package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C12_ForLoopSoru8 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();

        tersYaz(kelime);


    }

    private static void tersYaz(String kelime) {

        String terss=kelime.substring(kelime.length()-1);

        //5 harfli bir kelime olsun girilen
        // = i________3__2
        for (int i = kelime.length()-2; i >=0 ; i--) {

            terss+=kelime.substring(i,i+1);
            //4 +=  ________________3,4


        }

        System.out.println(terss);

    }
}
