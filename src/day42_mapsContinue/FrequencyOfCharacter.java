package day42_mapsContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {


        String str = "bbcccaaaaa";
        Map<String, Integer> map = new LinkedHashMap<>();//2
        //Map<Character,Integer>map=new LinkedHashMap<>();1

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            // map.put(each.charAt(0),frequency);  1
            map.put(each, frequency); // 2
        }
        System.out.println(map);


    }
}
