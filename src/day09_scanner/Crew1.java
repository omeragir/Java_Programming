package day09_scanner;

public class Crew1 {
    public static void main(String[] args) {
        int num=50;


        String result1=(num==50||num==75||num==100)?
                (num==50)?"20 crew,30 passengers"
                        :(num==75)?"25 crew,50 passengers"
                        :"30 crew, 70 passengers"

                :"Invalid";
        System.out.println(result1);

    }
}
