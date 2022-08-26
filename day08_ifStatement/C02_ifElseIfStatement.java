package javaKurs.day08_ifStatement;

import java.util.Scanner;

public class C02_ifElseIfStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 0 dan 100e kadar bir not giriniz: ");
        double note=scan.nextDouble();

        if (note<0 || note>100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        }else if (note<50) {
            System.out.println("notunuz : D");
        }else if (note<60) {
            System.out.println("notunuz : C");
        }else if (note<80) {
            System.out.println("notunuz : B");
        }else {
            System.out.println("notunuz : A");

        }

    }
}
