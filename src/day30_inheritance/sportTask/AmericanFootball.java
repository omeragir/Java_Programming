package day30_inheritance.sportTask;

public class AmericanFootball extends Sport {

    private String clothes;

    public AmericanFootball(String name, int numberOfPlayers, int numberOfReferee, String rules, String clothes) {
        super(name, numberOfPlayers, numberOfReferee, rules);
        setClothes(clothes);
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
