package day08_ternaries_switch;

public class BrowserName {
    public static void main(String[] args) {
        String browserName = "edge";
        String result = "";

        switch (browserName) {
            case "chrome":
                result = "The variable browser is: Chrome";
                break;
            case "firefox":
                result = "The variable browser is: Firefox";
                break;
            case "opera":
                result = "The variable browser is: Opera";
                break;
            case "safari":
                result = "The variable browser is: Safari";
                break;
            case "edge":
                result = "The variable browser is: Edge";
                break;
            default:
                result = "Invalid Browser";
                break;
        }
        System.out.println("result = " + result);

    }
}
