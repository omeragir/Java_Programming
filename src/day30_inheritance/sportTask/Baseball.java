package day30_inheritance.sportTask;

public class Baseball extends Sport{

    private int numberOfsStrokes;

    public Baseball(String name, int numberOfPlayers, int numberOfReferee, String rules, int numberOfsStrokes) {
        super(name, numberOfPlayers, numberOfReferee, rules);
        setNumberOfsStrokes(numberOfsStrokes);
    }

    public int getNumberOfsStrokes() {
        return numberOfsStrokes;
    }

    public void setNumberOfsStrokes(int numberOfsStrokes) {
        this.numberOfsStrokes = numberOfsStrokes;
    }

    public void bestStroke(){
        System.out.println(getName()+" is best stroke");

    }
}
