package javaKurs.day22_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5) kullanıcıdan bir cumle isteyin ve
        cumledeki kelime sayisini yazdirin.

        "bugun java cok guzel cunku artık kod yazabiliyoruz"
         */


        Scanner scan=new Scanner (System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();


        String [] cumle=str.split(" ");
        System.out.println(Arrays.toString(cumle)); //[bugun, java, cok, guzel, cunku, artık, kod, yazabiliyoruz]

        System.out.println("cumledeki kelime sayisi: "+cumle.length); // 8



    }
}
