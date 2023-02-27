package day08_ternaries_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {
        int number=21;
        String result=(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(result);
        System.out.println("----------------------------") ;


        int num=1;
        String month="";

        month=(num==1)?"January":(num==2)?"February":(num==3)?"March":(num==4)?"April":(num==5)?"May":(num==6)?"June"
                :(num==7)?"July":(num==8)?"August":(num==9)?"September":(num==10)?"October":(num==11)?"November":"December";

        System.out.println(month);
        System.out.println("---------------------------------------");

    }
}
