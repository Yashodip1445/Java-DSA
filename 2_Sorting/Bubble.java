public class Bubble {
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length; turn++) { // 0 to n-2
            for (int j = 0; j < arr.length - turn - 1; j++) { // 0 to n-2-turn
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        bubbleSort(arr);
        PrintArray(arr);

    }
}
