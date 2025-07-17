// 
//what is Array 
// operation in Array =>  Create , input , output , update 

import java.util.Scanner;

public class Basic {

    public static void Update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String agrs[]) {
        // Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50];

        // marks[0] = sc.nextInt(); // phy
        // marks[1] = sc.nextInt(); // chemistry
        // marks[2] = sc.nextInt(); // math

        // System.out.println("phy = " + marks[0]);
        // System.out.println("che = " + marks[1]);
        // System.out.println("Math = " + marks[2]);

        // int percentage =( marks[0]+ marks[1]+ marks[2]) / 3;
        // System.out.println("Percentage = "+percentage + "%");
int marks[] = { 97, 98, 99 };
        Update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");   


        }
        System.out.println();
       
    }
}