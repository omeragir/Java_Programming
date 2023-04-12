package day28_encapsulation.task;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1=new Candy("Milka",10,3,false);
        Candy candy2=new Candy("Ferraro",5,2,true);
        Candy candy3=new Candy("Rewe",12,1,false);
        Candy candy4=new Candy("Lidl",15,2.5,true);
        Candy candy5=new Candy("Kaufland",8,1.5,true);

        ArrayList<Candy>candies=new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy each : candies) {
            System.out.println(each.getBrand()+" "+each.getPrice());
        }

    }
}
