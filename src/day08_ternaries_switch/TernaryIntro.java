package day08_ternaries_switch;

public class TernaryIntro {
    public static void main(String[] args) {
        int score = 85;
        String result = "";
        if (score >= 60) {
            result = "passed";
        } else {
            result = "failed";
        }
        System.out.println(result);

        System.out.println("---------------------------------------------------");
        String solve = (score >= 60) ? "Passed" : "failed";
        System.out.println(solve);
        System.out.println("---------------------------------------------------");

        int age=21;
        String r="";
        if(age>=21){
            r="eligible";
        }else{
            r="not eligible";
        }
        System.out.println(r);
        System.out.println("---------------------------------------------------");
        String result3=(age>=21)?"eligible":"not eligile";
        System.out.println(result3);
        System.out.println("---------------------------------------------------");











    }

}
