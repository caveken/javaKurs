package javaKurs.day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir sayi alin
        sayi pozitif ise sayi pozitif yazdırın
        sayi negatif ise karesinialin.

         */

        Scanner scan=new Scanner (System.in);
        System.out.println("lütfenbir sayi giriniz");
        double sayi=scan.nextDouble();

        //String sonuc=sayi>0?"sayi pozitif":(sayi*sayi);
        // eğer ternary içindeki sonuçlar farklı data türünde ise
        //atama yapamayız sadece sout ile yazdırabiliriz

        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));
    }
}
