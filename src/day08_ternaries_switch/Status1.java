package day08_ternaries_switch;

public class Status1 {
    public static void main(String[] args) {

        int statusCode = 200;
        String result2 = "";
        String result1 = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" : (statusCode == 301) ? "Moved Permanently" : (statusCode == 303) ? "See Other" : (statusCode == 304) ? "Not Modified"
                : (statusCode == 307) ? "Temporary Redirect" : (statusCode == 400) ? "Bad Request" : (statusCode == 401) ? "Unauthorized" : (statusCode == 403) ? "Forbidden" : (statusCode == 404) ? "Not Found"
                : (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Server Error" : (statusCode == 503) ? "Service Unavailable" : "Invalid Number";
        System.out.println(result1);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");

        switch (statusCode) {
            case 200:
                result2 = "OK";
                break;
            case 201:
                result2 = "Created";
                break;
            case 202:
                result2 = "Accept";
                break;
            case 301:
                result2 = "Moved Permanently";
                break;
            case 303:
                result2 = "See Other";
                break;
            case 304:
                result2 = "Not Modified";
                break;
            case 307:
                result2 = "Temporary Redirect";
                break;
            case 400:
                result2 = "Bad Request";
                break;
            case 401:
                result2 = "Unauthorized";
                break;
            case 403:
                result2 = "Forbidden";
                break;
            case 404:
                result2 = "Not Found";
                break;
            case 410:
                result2 = "Gone";
                break;
            case 500:
                result2 = "Internal Server Error";
                break;
            case 503:
                result2 = "Service Unavaible";
                break;
            default:
                result2 = "Invalid number";

        }
        System.out.println("result2 = " + result2);


    }
}
