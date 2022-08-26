package javaKurs.day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeYazdirma {
    public static void main(String[] args) {
        enUzunKelimeYazdir("ali","ayse","ismail","ahmet","abdullah");

    }

    public static void enUzunKelimeYazdir(String... kelime ) {
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
