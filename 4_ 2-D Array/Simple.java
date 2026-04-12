import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        /*
         * what is 2D array
         * multi- dimention arrays
         * 
         */
        // Create a 2D array with 2 rows and 3 columns
        // int [][] numbers= {
        // {1,2,3}, // row
        // {4,5,6} // colume
        // };

        // // print all elemnet using loop
        // for (int i=0; i<numbers.length;i++){
        // for(int j =0;j<numbers[i].length;j++){
        // System.out.print(numbers[i][j]+" ");
        // }
        // System.out.println();
        // }

        System.out.println("Simple 2D- Arrays question ");
        int matrix[][] = new int[4][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j]= sc.nextInt();

            }
        }

        // output 
        for(int i=0; i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print([i][j]+" ");
            }
            System.out.println();
        }
        


    }
}
