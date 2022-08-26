package javaKurs.day32_strngBuilder;

import java.util.Scanner;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

        String input = "Hey gidi for loop gunleri";
        StringBuilder tersInput = tersineCevir(input);
        System.out.println(tersInput);
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("sb.reverse() = " + sb.reverse());


    }

    public static StringBuilder tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse();
    }
}
