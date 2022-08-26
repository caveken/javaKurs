package javaKurs.day35_InheritancedaConstractorKullanimi;

public class Child extends BParent{
    String isim="child isim belirtilmedi";
    protected String childKlupAdi="child klubu";

    Child(){
        System.out.println("child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Granpa Cons. calisir,
        // Parent veya Child cons calismaz


        Child child1=new Child();
        child1.parentKlupAdi="child2";// atama sadece child1 objesinde gecerli
        child1.grandpaKlupAdi="child1";// atama sadece child1 objesinde gecerli
        System.out.println(child1.grandpaKlupAdi);
        System.out.println(gp1.grandpaKlupAdi);

        // child1 objesi icin Child cons calisir
        /*
          Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik
          Java inheritance'da parent class'lardaki
          ozellikleri kullanabilmek icin
          o class'larin constructor'larini
          otomatik calistiran bir yapi kurmustur.
          Ornegin biz child class'inda
          Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz
          Java Child(){} gordugunde
          once parent'in constuctor'ini calistirmam lazim der
          buradan Parent cons'a gider
          Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.
          calismasi gerekir der
          Boylece extends keyword olmayan class'a kadar gider
          ve oradan baslayarak tum constructorlari
          asagi dogru calistirir
         */



    }
}
