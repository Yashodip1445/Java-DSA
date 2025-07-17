import java.util.*;

public class LargestNo {
    /*
     * Time Complexity: O(n) - where n is the length of input array
     * Space Complexity: O(1) - only using constant extra space
     */
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Single pass through array to find both largest and smallest
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
                System.out.println("smallest value is = " + smallest);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Largest value is = " + getLargest(numbers));
    }
}
