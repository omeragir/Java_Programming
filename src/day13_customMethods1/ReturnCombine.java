package day13_customMethods1;

public class ReturnCombine {
    public static void main(String[] args) {
        combine("one", "two");
        System.out.println(combine("one", "two"));


    }

    public static String combine(String word1, String word2) {
        String newWord;

        if (word1.endsWith("" + word2.charAt(0))) {
            newWord = word1 + word2.substring(1);
        } else {
            newWord = word1 + word2;
        }
        return newWord;
    }


}
