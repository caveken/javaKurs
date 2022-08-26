package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir karakter girmesini isteyin
        ve girilen karakterin harf olup olmadığını yazdırı
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf gir");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf <='z') || (harf>='A'&& harf<='Z')) {

            System.out.println("girilen karakter harftir");
        } else {
            System.out.println("girilen karakter harf değildir");


        }
    }
}