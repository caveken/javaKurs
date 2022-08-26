package javaKurs.day10_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0));//J

        System.out.println(str.toUpperCase().charAt(7)); //R

        System.out.println(str.charAt(21));//l

        /*
        System.out.println(str.charAt(22));//StringIndexOutOfBoundsException
        son harfi bulmak için str'in uzuluğunun 1 eksiğini index olarak gireriz
        eğer index olarak uzunluğu veya daha fazla bir sayı girersek java exception verir
         */

        //charAt() kullandığımızda sonuç char olacağı için artık

    }
}
