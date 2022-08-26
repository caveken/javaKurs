package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_Soru5_Fibonacci {
    public static void main(String[] args) {
        /*
        verilen bir sayidan kucuk tum fibonacci sayilarini bir liste olarak olusturup yazdirin.
         */
        int verilenSayi=50;

        List<Integer>verilenSayiFibonacci=new ArrayList<>();

        int ilkSayi=0, ikinciSayi=1, ucuncuSayi;
        verilenSayiFibonacci.add(ilkSayi);
        verilenSayiFibonacci.add(ikinciSayi);



        do {
            ucuncuSayi=ilkSayi+ikinciSayi;
            ilkSayi=ikinciSayi;
            ikinciSayi=ucuncuSayi;

            if (ucuncuSayi<verilenSayi){
                verilenSayiFibonacci.add(ucuncuSayi);
            }

        }while(verilenSayi>ucuncuSayi);

        System.out.println("Fibonacci List: "+verilenSayiFibonacci);







    }
}



