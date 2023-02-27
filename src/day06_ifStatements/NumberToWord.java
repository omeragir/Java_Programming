package day06_ifStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int number=1;
        String word="";

        if(number==1){
            word="one";
        }if(number==2){
            word="two";
        }if(number==3){
            word="three";
        }if(number==4){
            word="four";
        }if(number==5){
            word="fife";
        }if(number==6){
            word="six";
        }if(number==7){
            word="seven";
        }if(number==8){
            word="eight";
        }if(number==9){
            word="nine";
        }
        System.out.println("word = " + word);

    }
}
