
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        // loop through the numbers with a for loop
                    
        // find the last elemet of the array
        int last = array[array.length - 1];

        for(int i = 0; i < array.length; i++) {
            int number = array[i];
            
            if(number == last) {
                System.out.print(number + "");
            } else {
                System.out.print(number + ", ");
            }
               
        }
        
        
       
    }
}
