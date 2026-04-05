
// Write a program which accept element of a matrix and dispay its response 
// Transpose of a matrix 
/* 
java transpose --> 
Enter row , colums ? 3,4 

Enter element of matrix 
1 2 3 4
5 6 7 8
9 9 -1 2

The response matrix
1 5 9
2 6 9
3 7 -1
4 8 2

*/
import java.io.*;
import java.util.Scanner;
class Transpose {
    public static void main(String args[])  throws IOException{
     // use scanner to accpet data from keyboard 
     Scanner sc = new Scanner(System.in);

    // accept row and colume of a matrix 
    System.out.println("Enter rows , colums? : ");
    int r = sc.nextInt();
    int c= sc.nextInt();

    //  create a an array with size [r][c]

    int arr [][] = new int[r][c];
    //     // accept a matrix from keyboard   
       System.out.println("Enter element of Matrix :");

       for(int i =0; i<r;i++)
        for (int j =0;j<c ; j++)
        arr[i][j] = sc.nextInt();

            System.out.println("The transpose martix : ");

            //  take coulum as row and voice versa and display 

            for(int i=0; i< c; i++){
                for(int j=0; j<r;j++){
                    System.out.print(arr[j][i]+  " " );

                }
                System.out.print("\n" );
            }
        }

  }


