package javaKurs.day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi
        buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf
        olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk
        kelimesi icermiyor” yazdirin.
         */

        String cumle="Java buyuk, dunya kucuk";


        //requirements de buyuk ve kucuk harf hassasiyeti ile
        //ilgili bilgi verilmemiş
        //ikinci olarakta her iki kelimeyi içerme durumu açıklanmamıs
        //bu durumda görevi bize kim verdi ise ona sormak lazım

        //ek req. ikisini de iceriyorsa "karar ver buyuk mu yazdırayım
        //kucukmu"

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){

            System.out.println("karar ver buyuk mu yazdirayim kucukmu");

        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("cumle kucuk yada buyuk içermiyor");
        }

    }
}
