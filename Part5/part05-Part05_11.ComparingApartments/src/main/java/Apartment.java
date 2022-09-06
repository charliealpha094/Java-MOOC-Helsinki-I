
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        
        if(this.squares <= compared.squares) {
            return false;
        }
        return true;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        
        int comparedPrice = compared.princePerSquare * compared.squares;
        int difference = price - comparedPrice;
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceApartment = this.princePerSquare * this.squares;
        
        int comparedPrice = compared.princePerSquare * compared.squares;
        
        if(priceApartment <= comparedPrice) {
            return false;
        }
        return true;
    }

}
