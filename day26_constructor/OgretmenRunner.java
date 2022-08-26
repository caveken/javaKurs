package javaKurs.day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        ogretmen ogretmen1 = new ogretmen();
        System.out.println("Ogretmen 1 " + ogretmen1);
        ogretmen ogretmen2 = new ogretmen("Emre", "Akdogan", "1/1/2001", "Matematik", "Fizik");
        System.out.println("Ogretmen 2 " + ogretmen2);
        ogretmen ogretmen3 = new ogretmen("Cavidan", "Kabinkara", "1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);
    }

}
