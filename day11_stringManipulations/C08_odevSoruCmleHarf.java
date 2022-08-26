package javaKurs.day11_stringManipulations;

public class C08_odevSoruCmleHarf {

    public static void main(String[] args) {




        /*
    kullanıcıdan bir cumle ve harf isteyin
    harfin cümlede varolup olmadığını yazdırın
    varsa indexini isteyin
     */


        String cumle="Java ile hayat guzel canlar";


        //"c" yi sor

        if (cumle.indexOf("c")==-1){
            System.out.println("indexte c yok");
        }else {
            System.out.println(cumle.indexOf("c"));
        }


    }
}
