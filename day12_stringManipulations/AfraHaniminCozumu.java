package javaKurs.day12_stringManipulations;

public class AfraHaniminCozumu {
    public static void main(String[] args) {

        /*String input="AsbybbyT";
        String buyukHarf=input.substring(0,1).toUpperCase();
        String kucukHarf=input.substring(input.length()-1).toLowerCase();
        if (input.contains(buyukHarf)&&input.contains(kucukHarf)&& !input.contains(" ") && input.length()>=8){
            System.out.println("sifreniz kaydedildi");
        }else{
            System.out.println("sartlara uygun bir sifre giriniz");
        }
             */
        String input="asbybsby";
        String buyukHarf=input.substring(0,1).toUpperCase();
        String kucukHarf=input.substring(input.length()-1).toLowerCase();
        if (input.startsWith(buyukHarf)&& input.endsWith(kucukHarf)&& !input.contains(" ") && input.length()<=8){
            System.out.println("sifreniz kaydedildi");
        }else{
            System.out.println("sartlara uygun bir sifre giriniz");
        }


        System.out.println(buyukHarf);





    }
}
