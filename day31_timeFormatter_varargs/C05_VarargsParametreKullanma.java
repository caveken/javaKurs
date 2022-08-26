package javaKurs.day31_timeFormatter_varargs;

public class C05_VarargsParametreKullanma {
    public static void main(String[] args) {
        enUzunKelimeYazdir(5, "ali", "ayse", "ismail", "ahmet", "abdullah");

            /*
     Varargs teorik olarak sonsuz sayida element alabilir
     bir method'da parametre olarak varargs varsa
     varargs'in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.
     oncesinde farkli parametreler olabilir ama
     varargs'dan sonra parametre OLAMAZ
     Bu kuraldan oturu bir method'da sadece 1 tane varargs olabilir
     */
    }
    public static void enUzunKelimeYazdir(int kelimeSayisi,String ...kelime ) {
        String enUzunKelime=kelime[0];
        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println("en uzun kelime: "+enUzunKelime);

    }
}
