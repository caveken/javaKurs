package javaKurs.day07_ifStatements;

public class C03_BasitIfStatement {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki
        satirlar bagimsiz olur
        eger birden fazla satır aynı if sartına bağlanmışsa
        butlaka süslü parantez kullanmalıyız.

         */
        int sayi=-23;

        if(sayi>0)
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");
            System.out.println("ucuncu satir");

        if (sayi%2==0)
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir");

        if (sayi%5==0)
            System.out.println("Sayi 5'in tam kati");
    }
}
