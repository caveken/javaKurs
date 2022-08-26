package javaKurs.day27_staticKeyword;

public class C01 {
        static int sayi=10;
        int rakam=5;

    public static void main(String[] args) {
         /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */


        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri: "+obj1.rakam);//5 main metot static, rakam variable instance olduğundan ulaşabilmek için obje oluştruduk
        System.out.println("obj1 in sayi degeri: "+sayi);//10 obj1. yazmaya gerek yok çünkü static variable

        obj1.rakam+=1;//5+1=6
        sayi+=1;//10+1=11

        System.out.println("obj1 in rakam degerin +1 sonrasi: "+obj1.rakam);//6
        System.out.println("obj1 in sayi degerin +1 sonrasi: "+sayi);//11

        C01 obj2=new C01();// her yeni klasta instance var. lar yeniden doğar clasta atanan değerle (rakam=5;)
        obj2.rakam++; //5 + 1 =6
        //soru su olacak obje olusturulduktan sonra rakama bir değer ataması yapılmıs mı? hayır,
        // obj2 burada olusturuldu o yüzden yukarıda yapılanlar bizi ilgilendirilmez, takibe buradan baslarız
        //yukarıda instance olarak rakama bir değer atanmıs mı evet o zaman 5 yazdırır

        obj2.sayi++;  // 11+ 1 =12 static var. olduğu için tüm clas içindeki atamalar geçerli
        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra obj2'in sayi degeri : " + obj2.sayi); // 12
        /*
                STATIC --CLASS--classın basından itibaren bak
        INSTANCE-- OBJECT --objeyi olusturduktan sonra bak

         */

    }
}
