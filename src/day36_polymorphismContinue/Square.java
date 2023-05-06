package day36_polymorphismContinue;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)){
            System.err.println("Invalid object ,object must be Square");
            System.exit(1);
        }
        if (side== ((Square) obj).side){
            return true;
        }
        return false;
    }
}
