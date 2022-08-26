package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatement {

    public static void main(String[] args) {


        /*
        bi önceki soruda kullanıcı negatif
        değer girerse uyaralım

        Not: birden fazla if-else if birbirine bağlanmışsa
        son durum önemlidir
        eğer else ile bitiyorsa
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (yas < 65) {
                System.out.println("emekli olamazsın" +
                        " emekli olabilmek için " + (65 - yas) +
                        " yil daha çalışmalısın");
            } else {
                System.out.println("sureniz dolmuş isterseniz emekli olabilirsiniz");

            }


        }
}
