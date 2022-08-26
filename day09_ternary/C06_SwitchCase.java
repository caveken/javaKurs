package javaKurs.day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün ismini alın
        hafta içi veya hafta sonu olduğunu yazdırın
         */




        /*
        String gun1="PAzartesi";
        gun1.toLowerCase();

        //veya böyle String gun1="PAzartesi".toLowerCase();


        switch (gun1) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecerli bir gun giriniz");

         */





        Scanner scan=new Scanner (System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun=scan.next().toLowerCase();



        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
            break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecerli bir gun giriniz");








        }
    }
}
