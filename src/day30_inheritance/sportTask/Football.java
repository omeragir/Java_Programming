package day30_inheritance.sportTask;

public class Football extends Sport {

    private int numberOfTower;

    public Football(String name, int numberOfPlayers, int numberOfReferee, String rules, int numberOfTower) {
        super(name, numberOfPlayers, numberOfReferee, rules);
      setNumberOfTower(numberOfTower);
    }

    public int getNumberOfTower() {
        return numberOfTower;
    }

    public void setNumberOfTower(int numberOfTower) {
        this.numberOfTower = numberOfTower;
    }
}
