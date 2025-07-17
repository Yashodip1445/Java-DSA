// public class main {

//     public static void main(String[] args) {
//         System.out.println("print  the array");
//         int arr[]= {50,60,70,80};
//         // display the all element 
//         for(int i=0; i<=4;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

/*2 */

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class main{
    public static void main(String[] args) throws IOException {
        // to accept data from keyboard 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ask a how many Subject 
        System.out.println("How many subject ");
        int  n = Integer.parseInt(br.readLine());
        // create 1D array size n 
        int[]marks = new int [n];
         // store element into the array 
         for (int i=0;i<n;i++){
            System.out.println("Enter a marks ");
            marks [i] =Integer.parseInt(br.readLine());
         }
         // find total marks 
         int tot =0;
         for( int i=0;i<n;i++){
            tot +=marks [i];
            // display total marks 
            System.out.println("Total marks="+tot); 

            // find percentage 
            float percent =(float ) tot/n;
            System.out.println("Percentage= " + percent);

            System.out.println("complete a Q");
         }
        
    }
}