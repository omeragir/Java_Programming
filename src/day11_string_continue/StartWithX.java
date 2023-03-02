package day11_string_continue;

public class StartWithX {
    public static void main(String[] args) {
        String cod="xcodex";
        boolean isControl= cod.startsWith("x");

        if(isControl){
            System.out.println(cod.replaceFirst("x", "a"));
        }else{
            System.out.println("we find not ");
        }



    }




}
