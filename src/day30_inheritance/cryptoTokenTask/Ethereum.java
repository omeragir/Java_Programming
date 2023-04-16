package day30_inheritance.cryptoTokenTask;

public class Ethereum extends CryptoToken{

    public Ethereum(double price, double marketCAp, double volume, double circulationSupply, int quantity, boolean isMineable) {
        super(price, marketCAp, volume, circulationSupply, quantity, isMineable);
    }
}
