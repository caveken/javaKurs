package javaKurs.day15_overloading_forloop;

public class C06_StringTerseCevirmeTekrar {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String cumle = "Java ile hayat kurs ilerledikce guzellesiyor " +
                "fakat ogrenmek icin cok emek vermek gerekiyor";

        cumleyiTerstenYazdir(cumle);


    }

    private static void cumleyiTerstenYazdir(String cumle) {

        String sonuc = cumle.substring(cumle.length()-1);

        for (int i=cumle.length()-2; i>=0 ; i--) {

            sonuc +=cumle.substring(i,i+1);

        }
        System.out.println(sonuc);


    }
}
