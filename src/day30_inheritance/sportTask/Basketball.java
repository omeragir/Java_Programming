package day30_inheritance.sportTask;

public class Basketball extends Sport{

    private int periodNumber;

    public Basketball(String name, int numberOfPlayers, int numberOfReferee, String rules, int periodNumber) {
        super(name, numberOfPlayers, numberOfReferee, rules);
        setPeriodNumber(periodNumber);
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public void setPeriodNumber(int periodNumber) {
        this.periodNumber = periodNumber;
    }

    public void win(String teamNAme){
        System.out.println(teamNAme+" is winning");
    }

}
