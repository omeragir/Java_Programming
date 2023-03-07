package day13_customMethods1;

public class Title {
    public static void main(String[] args) {
    String str1=titleOfFirma("jAVa");
        System.out.println(str1);

    }
    public static String titleOfFirma(String word){
        String newWord;
        newWord=""+word.toUpperCase().charAt(0)+word.toLowerCase().substring(1);

        return  newWord;

    }

}
