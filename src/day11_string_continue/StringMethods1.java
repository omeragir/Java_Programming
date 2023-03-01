package day11_string_continue;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "JAVA PROGRAMMING";
        // str1 = str1.toLowerCase();
        //System.out.println(str1);
        System.out.println(str1.toLowerCase());
        System.out.println("---------------------------");

        String str2 = "cydeo school";
        // str2 = str2.toUpperCase();
        //System.out.println( str2 );
        System.out.println(str2.toUpperCase());
        System.out.println("---------------------------");

        String word = "Wooden Spoon";

        String word1 = word.toUpperCase();
        String word2 = word.toLowerCase();

        System.out.println(word);

        System.out.println(word1);

        System.out.println(word2);

        System.out.println("---------------------------");

        String str4 = "            Cydeo School";
        //str4= str1.trim();
        System.out.println(str4.trim());

        System.out.println("---------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index = sentence1.indexOf('w');
        System.out.println(index);
        System.out.println("---------------------------");

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);

        System.out.println("---------------------------");
        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python");
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);
        System.out.println("---------------------------");


        String w = "Java";
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        System.out.println("---------------------------");
        String w2="Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));



    }
}
