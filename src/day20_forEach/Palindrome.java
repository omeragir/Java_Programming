package day20_forEach;

public class Palindrome {
    public static void main(String[] args) {
        String[] words =  {"anna", "level", "Java"};

        int count = 0;

        for (String each : words) {
            String reverse ="";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                count++;
            }
        }

        System.out.println(count);

    }
}
/*
3. Write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */
/*
    public static void main(String[] args) {

        String[] array = {"anna", "level", "Java"};

        int count = 0;

        for (String s : array) { // takes each name and changes it to a string
            boolean isPalindrome = true;
            int n = s.length(); // takes string length and stores it into 'n'
            for (int i = 0; i < n/2; i++){ // is checking if 'i' is less than half the length of the string
                if (s.charAt(i) != s.charAt(n-i-1)){ // is checking if the first letter is similar to last letter
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome){
                count++;
            }
        }
        System.out.println(count);
    }
     */