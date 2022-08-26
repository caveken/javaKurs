package javaKurs.day12_stringManipulations;

import java.util.Scanner;

public class C09_Soru5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime yazınız");
        String kelime=scan.next();

        String kelimeninTersi=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println(kelimeninTersi);






    }

}
