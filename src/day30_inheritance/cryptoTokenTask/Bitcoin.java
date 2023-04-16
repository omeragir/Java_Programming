package day30_inheritance.cryptoTokenTask;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, double marketCAp, double volume, double circulationSupply, int quantity, boolean isMineable) {
        super(price, marketCAp, volume, circulationSupply, quantity, isMineable);
    }
}
