import java.util.*;

class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 3, 99, 23};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest = " + max);
    }
}
