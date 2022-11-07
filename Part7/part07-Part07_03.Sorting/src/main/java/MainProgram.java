
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        
    }
    
    public static int smallest(int[] array) {
        
        int smallestNum = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallestNum) {
                smallestNum = array[i];
            }
        }
        return smallestNum;
    }
    
    public static int indexOfSmallest(int[] array) {
        
        int index = 0;
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int index = startIndex;
        int smallest = table[index];
        
        for(int i = startIndex; i < table.length; i++) {
            if(table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    // Swap two values of the given indeces
    public static void swap(int[] array, int index1, int index2) {
        int temperature = array[index1];
        array[index1] = array[index2];
        array[index2] = temperature;
    }
    
    // Sort an array from the smallest value to the largest value
    public static void sort(int[] array) {
        int index = 0;
        
        while(index < array.length - 1) {
            int smallest = indexOfSmallestFrom(array, index);
            swap(array, index, smallest);
            
            index++;
        }
    }

}
