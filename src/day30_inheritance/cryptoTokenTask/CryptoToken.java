package day30_inheritance.cryptoTokenTask;

public class CryptoToken {
    private double price,marketCAp,volume,circulationSupply;
    private int quantity;
    private boolean isMineable;

    public CryptoToken(double price, double marketCAp, double volume, double circulationSupply, int quantity, boolean isMineable) {
        setPrice(price);
        setMarketCAp(marketCAp);
        setVolume(volume);
        setCirculationSupply(circulationSupply);
        setQuantity(quantity);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price can not to be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public double getMarketCAp() {
        return marketCAp;
    }

    public void setMarketCAp(double marketCAp) {
        if (marketCAp<=0){
            System.err.println("Market cap can not to be negative or zero ");
            System.exit(1);
        }
        this.marketCAp = marketCAp;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculationSupply() {
        return circulationSupply;
    }

    public void setCirculationSupply(double circulationSupply) {
        this.circulationSupply = circulationSupply;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.err.println("Quantity can not to be negative or zero");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }
    public double totalPrice(){
        return price*quantity;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", marketCAp=" + marketCAp +
                ", volume=" + volume +
                ", circulationSupply=" + circulationSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }
}
