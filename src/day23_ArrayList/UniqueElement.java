package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emily");
        names.add("Emily");
        names.add("Ali");
        names.add("Emily");
        names.add("Marika");

        for (String each : names) {
            if (names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println("unique "+each);
                //break;    first unique element give
            }
        }




    }
}
