package javaKurs.day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {


        //input olarak verilen iki in i toplayıp sonucunu yazdıran bir metod olusturun

        int input1=10;
        int input2=20;

        //metod 4 adımda olusturulur
        //1.adım metd call
        //2. adım argument eklenmesi gerekiyorsa ekle
        //eger metdun return type i voidden farklı olacaksa bir varble olusturup method call assign et

        topla(10, 25);

        topla(25432,265);



    }

    public static void topla(int input1, int input2) {
        //3. adim method oluştuktan sonra method
        // deklarasyonunda degistirilmesi gereken
        //bölümleri değiştirin (acces modifier, return type gibi)
        // return keyword'u ve dönecek degeri hesaplamalıyız

        System.out.println(input1+input2);


    }


}
