package javaKurs.day10_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str="java ögren, isi kap";
        System.out.println(str.length());//str ın karakter sayısını döndürür
        System.out.println(str.charAt(str.length()-1));//son karakteri yazdırır
        System.out.println(str.charAt(str.length()-3));


        String str2 ="";

        System.out.println(str2.length());

        String str3 =null;
        System.out.println(str3.length());//NullPointerException


    }
}
