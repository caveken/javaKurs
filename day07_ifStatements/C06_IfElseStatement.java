package javaKurs.day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatement {
    public static void main(String[] args) {


        /*
        kullanıcıya yaşını sorun eğer yaşı 65 ten küçükse
        "emekli olamazsın çalışmalısın" yazdırın 65 e eşit
        veya büyük ise "emekli olabilirsin" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65) {
            System.out.println("emekli olamazsın"+
                    " emekli olabilmek için "+(65-yas)+
                    " yil daha çalışmalısın");
        }

        if (yas>=65) {
            System.out.println("sureniz dolmuş isterseniz emekli olabilirsiniz");

        }


    }
}
