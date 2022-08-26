package javaKurs.day12_stringManipulations;

public class C06_Soru2 {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replace("$","");
        str2=str2.replace("$","");

        double num1=Double.parseDouble(str1);
        double num2=Double.parseDouble(str2);



        System.out.println(num1+num2);





    }
}
