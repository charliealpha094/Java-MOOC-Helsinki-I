
public class Statistics {
    // Variables
    private int count;
    private int sum;
    
    // Constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        // return (float)this.sum / this.count;
        double result = 0;
        if(this.sum != 0 && this.count != 0) {
            result = (float)this.sum / this.count;
        }
        return result;
    }
}
