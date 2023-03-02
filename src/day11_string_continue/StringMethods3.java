package day11_string_continue;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);
        System.out.println("-------------------------------------------");

        String str = "                      ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);

        System.out.println("-------------------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        String str3 = new String("cydeo");
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str3));

        System.out.println(str1.equals(str2));

        System.out.println("-------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-------------------------------------------");

        String sentence = "Hasan,Narin,Natalia,Sumeye";
        boolean hasAhmed=sentence.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);
        System.out.println("-------------------------------------------");

        String name="Micheal";
        boolean check=name.startsWith("Da");
        boolean check1=name.endsWith("al");
        System.out.println("check = " + check);
        System.out.println("check1 = " + check1);
        System.out.println("-------------------------------------------");



    }
}
