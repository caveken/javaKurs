package javaKurs.day40_final;

public abstract class CAbstract {
    void toplama(){
        System.out.println("bu metod toplama yapar");
    }
    abstract void carpma();
    abstract void bolme();
    //abstract void cikarma(){} abstract metod body kabul etmez

    void cikarma(){
        System.out.println("Bu method cikarma yapar");
    }
    /*
     bir method'un basina abstract yazarsaniz
     bu method'un child class'lar icin bir standart oldugunu declare ederiz
     ve method body'sine ihtiyac kalmaz
     */
}
