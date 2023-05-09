package day38_exceptionContinue;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("It`s break time");
    }
    public BreakTimeException(String message){
        super(message);
    }


}
