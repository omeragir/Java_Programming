package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

        double n1 = 10.5687954;
        DecimalFormat decimalFormat=new DecimalFormat("0.0");
        System.out.println("n1 = " + decimalFormat.format(n1));

    }
}
