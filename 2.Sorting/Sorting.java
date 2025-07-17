public class Sorting {

    // method 
public static void PrintArray(int arr[]) {
    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"");
    }
    System.out.println();
    
}
    public static void main(String[] args) {
        int arr[] = {45,32,1,56 };

        // bubble sort Implementation 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr);
    }
}
