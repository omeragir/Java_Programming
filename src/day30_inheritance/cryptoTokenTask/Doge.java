package day30_inheritance.cryptoTokenTask;

public class Doge extends CryptoToken{

    public Doge(double price, double marketCAp, double volume, double circulationSupply, int quantity, boolean isMineable) {
        super(price, marketCAp, volume, circulationSupply, quantity, isMineable);
    }
}
