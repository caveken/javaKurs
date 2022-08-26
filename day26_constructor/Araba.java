package javaKurs.day26_constructor;

public class Araba {
    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){

    }
    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */

    public void benzinliArac() {
        System.out.println("bu arac benzinlidir");
    }

    public void maxHiz(int hiz) {
        System.out.println("bu araba max " + hiz + " km hiz yapar");


    }
}
