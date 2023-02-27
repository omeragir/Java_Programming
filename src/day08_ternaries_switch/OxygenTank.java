package day08_ternaries_switch;

public class OxygenTank {
    public static void main(String[] args) {
        int certainLevel=40;
        String oxygenTank=(certainLevel>=90&&certainLevel<=100)?"Your tank is full":(certainLevel>=80&&certainLevel<90)?"Still okay"
                :(certainLevel>=70&&certainLevel<80)?"don`t go to far":(certainLevel>=60&&certainLevel<70)?"Start to head back"
                :(certainLevel>=50&&certainLevel<60)?"Be careful now you at at 50%":(certainLevel>=0&&certainLevel<50)?"Go to tank":"Invalid";
        System.out.println("oxygenTank = " + oxygenTank);
    }
}
