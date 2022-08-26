package javaKurs.day14_methodCreation;

public class C04_MethonCreationReturn {
    public static void main(String[] args) {
        //verilen isim ve soyismi ilk harfi buyuk
        //geriye kalanları * olacak sekilde değiştirip
        //bize bu halini döndüren bir metod oluşturun
        //not : programın ilerleyen kısımlarında isim ve
        // soyismi bu şekilde kullanmak istiyoruz

        String isim="sefa";
        String soyisim="baygul";

        String gizliIsim=isimGizle(isim, soyisim);

        System.out.println(gizliIsim);



        


    }

    public static String isimGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w", "*");

        return isim+" "+soyisim;


    }
}
