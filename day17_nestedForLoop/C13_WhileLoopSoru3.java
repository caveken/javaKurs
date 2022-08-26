package javaKurs.day17_nestedForLoop;

public class C13_WhileLoopSoru3 {
    public static void main(String[] args) {
        /*
        kullanıcıdan baslangıc ve bitiş degerlerini alın
        baslangıc degeri ve bitiş degeri dahil aralarındaki tüm çift sayıları
        while loop kullanarak ekrana yazdırın
         */

        int bas=50;
        int bitis=85;
        while (bas<=bitis) {

            if (bas%2==0) {
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
