package javaKurs.day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod{

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interfaces de abstract olan 3 metodu implement ettigimizde
    java itirazını durdurur
    sonradan ekledigimiz default veya static keyword ile
    tanımladıgımız metodları implement etmemiz sorun olusturmadı
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj=new C02_Child();
        obj.teker();


    }
}
