package day12_customMethods;

public class CustomFullName {
    public static void main(String[] args) {
        capitalization("cyDEo","SCHOOL");

    }
    public static void capitalization(String firstName,String lastName){
        System.out.println(firstName.toUpperCase().charAt(0)+firstName.toLowerCase().substring(1)+" "+
                lastName.toUpperCase().charAt(0)+lastName.toLowerCase().substring(1));
    }



}
