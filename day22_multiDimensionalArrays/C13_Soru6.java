package javaKurs.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13_Soru6 {
    public static void main(String[] args) {
        /*
        verilen bir array'den;
        istenen degere esit olan elemanlari kaldirip, 
        kalanlari yeni bir array olarak yazdiran bir method yaziniz.
         */
        
        int [] inputArr= {7,5,2,8,9,4,6,3};
        
        Scanner scan = new Scanner (System.in);
        System.out.println("lutfen array icerisinde olmasini istemediginiz bir tamsayiyi giriniz");
        int istenmeyendeger= scan.nextInt();
        
        istenenDegeriCikarYeniArrayOlustur(inputArr,istenmeyendeger);
        
        
        
    }

    public static void istenenDegeriCikarYeniArrayOlustur(int[] inputArr, int istenmeyendeger) {

        List<Integer>yeniArray=new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i]!=istenmeyendeger){

                yeniArray.add(inputArr[i]);

            }
        }
        System.out.println("yeni olusturulan Array: "+yeniArray);
    }
}
