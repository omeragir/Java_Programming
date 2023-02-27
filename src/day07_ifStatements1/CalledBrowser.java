package day07_ifStatements1;

public class CalledBrowser {
    public static void main(String[] args) {
        String browser = "m";
        String result = "";
        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge") {
            if (browser == "chrome") {
                result = "Chrome Browser is selected";
            } else if (browser == "firefox") {
                result = "Firefox Browser is selected";
            } else if (browser == "opera") {
                result = "Opera Browser is selected";
            } else if (browser == "safari") {
                result = "Safari Browser is selected";
            } else {
                result = "Edge Browser is selected";
            }

        } else {
            System.out.println("Invalid browser");
        }
        System.out.println(result);
    }
}
