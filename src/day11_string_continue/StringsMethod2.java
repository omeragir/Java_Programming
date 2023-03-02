package day11_string_continue;

public class StringsMethod2 {
    public static void main(String[] args) {
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);
        System.out.println("-------------------------------------------------");

        String word = "Java";
        word = word.replace('a', 'e');
        System.out.println(word);
        System.out.println("-------------------------------------------------");

        String sentence2 = "I love Java,Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);
        System.out.println("-------------------------------------------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);
        System.out.println("-------------------------------------------------");

        String sentence4 = "I love Java Programming";
        String languageName = sentence4.substring(7, 10 + 1);
        System.out.println(languageName);
        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        String day = sentence5.substring(9, 14 + 1);
        System.out.println(day);
        System.out.println("-------------------------------------------------");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
        int mail = email.indexOf('@') + 1;
        int mail2 = email.lastIndexOf('.');
        System.out.println(mail);
        String mail1 = email.substring(mail, mail2);
        System.out.println(mail1);

        String sentence6 = "I love Java Programming";
        int begin = sentence6.indexOf('J');
        String extra = sentence6.substring(7);
        System.out.println(extra);
        System.out.println("-------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);
        System.out.println(tomorrow);
        System.out.println("-------------------------------------------------");

        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);

        System.out.println("-------------------------------------------------");

        String str = "Python";
        String result=(str+"\n").repeat(10);
        System.out.println(result);


    }
}
