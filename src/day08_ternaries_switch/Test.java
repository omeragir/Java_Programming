package day08_ternaries_switch;

public class Test {
    public static void main(String[] args) {
        String version="";

        switch(version){

            case "cupcake":
                System.out.println("1.5");
                break;
            case "donat":
                System.out.println("1.6");
                break;
            case "eclair":
                System.out.println("2.1");
                break;
            case "froyo":
                System.out.println("2.2");
                break;
            case "Gingerbread":
                System.out.println("2.3");
                break;
            case "Honeycomb":
                System.out.println("3.1");
                break;
            case "Ice Cream Sandwich":
                System.out.println("4.0");
                break;
            case "Jelly Bean":
                System.out.println("4.1");
                break;
            case "KitKat":
                System.out.println(4.4);
                break;
            case "Lollipop":
                System.out.println("5");
                break;
            case "Oreo":
                System.out.println("8");
                break;
            case "Pie":
                System.out.println("9");
                break;
            default:
                System.out.println("Any other number is invalid and should display: Not a valid version");
                break;
        }

    }
}
