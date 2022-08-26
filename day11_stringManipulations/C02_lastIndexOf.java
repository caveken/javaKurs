package javaKurs.day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*verilen kelime icin asagıdaki sartlardan uygun
         olanı yazan bir program yaziniz
          -verilen kelime cumlede kullanılmamıs
          -verilen kelime cumlede saece 1 kere kullanılmıs
          -verilen kelime cumlede birden fazla kullanılmıs
         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1) {
            System.out.println("verilen kelime cümlede kullanılmamıs");
        }else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cümlede 1 kere kullanılmış");
        }else {
            System.out.println("verilen kelime cümlede 1 den fazla kullanılmıs");
        }

        System.out.println(kelimeIlkIndex);
        System.out.println(kelimeSonIndex);
    }
}
