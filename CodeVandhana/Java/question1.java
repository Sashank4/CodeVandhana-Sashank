import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        
        // Create a copy of the original array to shuffle
        int[] shuffledArray = Arrays.copyOf(originalArray, originalArray.length);
        
        // Shuffle the copied array
        shuffleArray(shuffledArray);
        
        // Print the shuffled array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
    
    // Fisher-Yates shuffle algorithm
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
