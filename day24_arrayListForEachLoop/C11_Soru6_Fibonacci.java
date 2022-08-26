package javaKurs.day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C11_Soru6_Fibonacci {
    public static void main(String[] args) {
        /*
        1 den baslayarak istenen kadar Fibonacci sayisini bir liste olarak olusturup yazdirin.
         */
        int istenenFibonacciAdeti=10;

        List<Integer> verilenSayiFibonacci=new ArrayList<>();

        int ilkSayi=1, ikinciSayi=1, ucuncuSayi;
        verilenSayiFibonacci.add(ilkSayi);
        verilenSayiFibonacci.add(ikinciSayi);

        for (int i = 0; i <istenenFibonacciAdeti ; i++) {

            ucuncuSayi=ilkSayi+ikinciSayi;
            ilkSayi=ikinciSayi;
            ikinciSayi=ucuncuSayi;

            verilenSayiFibonacci.add(ucuncuSayi);

        }

        System.out.println("Fibonacci List: "+verilenSayiFibonacci);







    }
}
