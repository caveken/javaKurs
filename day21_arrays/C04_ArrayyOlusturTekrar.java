package javaKurs.day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayyOlusturTekrar {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun

        int [] sayilar=arrayOlustur();

        System.out.println("girilen Array: "+Arrays.toString(sayilar));
    }

    public static int[] arrayOlustur() {


        Scanner scan=new Scanner(System.in);
        System.out.println("olusturmak istediginiz array uzunlugunu giriniz");
        int uzunluk= scan.nextInt();

        int [] biten=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+". indexteki sayiyi giriniz");
            biten[i]=scan.nextInt();

        }


        return biten;
    }
}
