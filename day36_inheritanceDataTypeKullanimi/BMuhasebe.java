package javaKurs.day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel{
    protected int saatUcreti=10;
    protected  int gunlukMesai=8;

    protected void maas(){
        System.out.println("personel min : "+(30*gunlukMesai*saatUcreti)+" maas alir");
        }
        protected void ozelSigorta(){
            System.out.println("isteyen calisana %50 indirimle ozel sigorta yapilir");
        }
}
