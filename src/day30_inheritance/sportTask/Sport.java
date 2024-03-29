package day30_inheritance.sportTask;

public class Sport {
    private String name;
    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0) {
            System.err.println("Players number can not be negative or zero");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }


    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if (numberOfReferee <= 0) {
            System.err.println("Referee number can not be negative or zero");
            System.exit(1);
            this.numberOfReferee = numberOfReferee;
        }

    }

    public void play() {
        System.out.println(getName() + " is playing");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
