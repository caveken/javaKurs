package javaKurs.day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{
    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("memurlar : "+30*saatUcreti*gunlukMesai+" maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirimle ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);
        System.out.println(mmr1.saatUcreti);
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();
        System.out.println(mmr1.isim);
        System.out.println(mmr1.soyisim);
        System.out.println(mmr1.departman);


        BMuhasebe mhsb1=new BMuhasebe();
         /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
        System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // Personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departman);//Personel


    }

}
