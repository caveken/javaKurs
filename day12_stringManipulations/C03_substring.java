package javaKurs.day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim="suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));

        System.out.println(isim.substring(2,4));

        //isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        //kredi kartının ilk 4 rakamı gorunsün geriye kalan *

        String isimilkharf = isim.substring(0,1).toUpperCase();
        String isimgerikalan=isim.substring(1).replaceAll("\\w","*");

        String soyisimilkharf = soyisim.substring(0,1).toUpperCase();
        String soyisimgerikalan = soyisim.substring(1).replaceAll("\\w","*");

        String kkilk4=kartNo.substring(0,4);
        String kkgeriyekalan="**** **** ****";

        System.out.println(isimilkharf+isimgerikalan+" "+soyisimilkharf+soyisimgerikalan+"\n"+kkilk4+" "+kkgeriyekalan);









    }
}
