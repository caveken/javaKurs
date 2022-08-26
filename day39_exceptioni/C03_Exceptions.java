package javaKurs.day39_exceptioni;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger sadece rakamlardan olusmalidir");
        } catch (Exception e) {
            System.out.println("ongorulemeyen bir hata olustu");
        }

        System.out.println("sayinin karesi: "+sayi*sayi);
        /*
        kullanicidan Sting olarak bir deger aliyor ve bunu int ceviriyoesak
        NumberFormatException ile karsilasabilecegimizi ongorururz
        bunun NumberFormatException aldigimizda kodun durmamamsini istiyorsak try catch ile cevirebiliriz
        Eger bilmedigimiz bir exception daha olusursa kodum durmasin istiyorsak bir kere daha catch cumlesi ekleyip
        onada En genis Exception i yazabiliriz.
         */
    }
}
