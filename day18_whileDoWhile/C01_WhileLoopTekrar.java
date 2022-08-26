package javaKurs.day18_whileDoWhile;

public class C01_WhileLoopTekrar {
    /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
    public static void main(String[] args) {
        char ilk='a';
        char son='j';
        String sonuc="";

        while (ilk<=son) {

            sonuc=sonuc+ilk+" ";

            ilk++;
        }
        System.out.println(sonuc.toUpperCase());
    }
}
