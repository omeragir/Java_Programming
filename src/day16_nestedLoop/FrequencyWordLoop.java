package day16_nestedLoop;

public class FrequencyWordLoop {
    public static void main(String[] args) {


        String str = "java JAVA jAvA JAva";
        String word = "Java";
        str = str.toLowerCase();
        word=word.toLowerCase();
        int counter = 0;

        while (str.contains(word)) {
            counter++;
            str = str.replaceFirst(word, "");
        }

        System.out.println(counter);
    }
}
/*
 Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */