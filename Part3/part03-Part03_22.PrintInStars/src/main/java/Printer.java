
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        // loop through the array
        for(int i = 0; i < array.length; i++) {
            int number = array[i];
            // loop through the looped numbers
            for(int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
