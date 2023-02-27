package day08_ternaries_switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum >= 1 && floorNum <= 3) {
            if (floorNum==1){
                System.out.println("Floor 1 selected.Companies :Lobby,Verizon,Starbucks");
            } else if (floorNum==2) {
                System.out.println("Floor 2 selected.Companies :Cydeo,Nasa,Intelsat");

            }else {
                System.out.println("Floor 3 selected.Companies :Lyft, Bofa, Stake House");
            }

        }else {
            System.out.println("invalid floor");
        }
    }
}
