package day25_constructor;

import java.util.*;

public class CarpetTestObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(2,3,1000,true);
        Carpet carpet2=new Carpet(2,3,1000,false);


        System.out.println(carpet1);
        System.out.println(carpet2);
    }
}
