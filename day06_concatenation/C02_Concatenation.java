package javaKurs.day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="güzeldir";
        int sayi1=5;
        int sayi2=4;



        //yukarıdaki variable leri kullanarak istenen metni yazdır

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);
        System.out.println(str1.toUpperCase()+" "+str2.toUpperCase()+" "+sayi1+sayi2);
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str1);
        System.out.println(" "+sayi1+sayi2+" "+str2);

        System.out.println(str1.concat(str2));
        System.out.println(str1.concat(" ").concat(str2));





    }
}
