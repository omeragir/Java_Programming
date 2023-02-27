package day08_ternaries_switch;

public class ChooseLanguage {
    public static void main(String[] args) {
        int num = 6;
        String result1 = (num == 1) ? "Hello, thank for your call" : (num == 2) ? "Hola, gracias para llamar" : (num == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                : (num == 4) ? "Privet, spasibo za vash zvonok" : (num == 5) ? "Merci, pour votre appel" : "Invalid";
        System.out.println("result1 = " + result1);
        System.out.println("---------------------------------------------------------------------------------------------");
        switch (num) {
            case 1:
                System.out.println("Hello, thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci, pour votre appel");
            default:
                System.out.println("invalid");
                break;
        }


    }
}
