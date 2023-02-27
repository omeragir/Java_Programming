package day07_ifStatements1;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int total=40;
        String result="";
        if(total==50||total==100||total==75){
            if(total==50){
                result="20 crew, 30 passenger";
            } else if (total==75) {
                result="25 crew, 50 passenger";
            }else {
                result="30 crew, 70 passenger";
            }
        }else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
