package day18_garbageCollection;

public class TestCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();

        carpet1.setInfo(10.5, 9.5, 8.5, true);

        System.out.println(carpet1);


        Carpet carpet2 = new Carpet();

        carpet2.setInfo(12, 9, 20, false);
        System.out.println(carpet2);


    }
}
