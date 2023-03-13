package day15_whileLoopIntro;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i)))

                continue;

            result += str.charAt(i);
        }

        System.out.println(result);

    }
}

/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */