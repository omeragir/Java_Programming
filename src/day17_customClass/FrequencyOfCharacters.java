package day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aabcccd";
        String result="";


        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==ch){
                    count++;
                }
                }
            if(result.contains(""+ch)){
                continue;
        }
          result+=ch+""+count;
        }
        System.out.println(result);
    }


}
/*
Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */