package javaKurs.day26_constructor;

public class ogretmen {
    String  isim="ısim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String dogumTarihi="d tarihi belirtilmedi";
    String brans="brans belirtilmedi";
    String yanBrans="yan brans belirtilmedi";
    public ogretmen() {
    }
    public ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }
    public ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }
    @Override
    public String toString() {
        return
                "\nisim : " + isim +
                        "\nsoyisim : " + soyisim +
                        "\ndogumTarihi : " + dogumTarihi +
                        "\nbrans : " + brans +
                        "\nyanBrans : " + yanBrans ;
    }

}
