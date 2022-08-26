package javaKurs.day17_nestedForLoop;

public class C01_ForLoopTekrar {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input= "taka tuka";
        String tekrarsiz="";
        String kullanilacakKelime=input.replaceAll("\\W", "");
        System.out.print(kullanilacakKelime.substring(0,1));
        tekrarsiz=kullanilacakKelime.substring(0,1);

        for (int i = 1; i <kullanilacakKelime.length() ; i++) {

            if (!tekrarsiz.contains(kullanilacakKelime.substring(i, i+1))) {

                System.out.print(", "+kullanilacakKelime.substring(i, i+1));
                tekrarsiz+=kullanilacakKelime.substring(i, i+1);
            }

        }
        System.out.println("");
        System.out.println("input: "+ input);
        System.out.println("tekrarsiz: "+tekrarsiz);

    }
}
