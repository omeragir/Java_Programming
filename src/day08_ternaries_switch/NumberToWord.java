package day08_ternaries_switch;

public class NumberToWord {
    public static void main(String[] args) {
        int number=2;

        String result=(number==1)?"One":(number==2)?"Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":(number==6)?"Six":(number==7)?"Seven":(number==8)?"Eight":
                (number ==9)?"Nine":"Invalid";
        System.out.println(result);

    }
}
