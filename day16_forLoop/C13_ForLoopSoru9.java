package javaKurs.day16_forLoop;

import java.util.Scanner;

public class C13_ForLoopSoru9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String input= scanner.nextLine().toUpperCase();
        String ters="";

        for (int i = input.length()-1; i >=0 ; i--) {
            ters+=input.substring(i,i+1);

        }


        if (input.equals(ters)) {
            System.out.println("girdiginiz metinini tersi ~"+ters+"~ bu metin palindrome metindir.");
        }else System.out.println("girdiginiz metinini tersi ~"+ters+"~ bu metin palindrome DEGİLDİR.");
    }
}
