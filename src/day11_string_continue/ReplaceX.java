package day11_string_continue;

public class ReplaceX {
    public static void main(String[] args) {
        String code = "xcodeX";

        if (code.contains("x") && code.contains("X")) {
            String newCode = code.toLowerCase().replace("x", "a");

            System.out.println(newCode);
        }else{
            System.out.println("Invalid");
        }


    }
}
/*
   Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */