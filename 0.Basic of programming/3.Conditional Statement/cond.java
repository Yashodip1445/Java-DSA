import java.util.*;

public class cond {

    public static void main(String[] args) {
        // if-else

        int age = 22;
        if (age <= 18) {
            System.out.println("vote ,drive");
        } else {
            System.out.println("not vote , not adult ");
        }

        // 1. print the largest of 2
        // A=1 B= 3
        int A = 1;
        int B = 3;
        if (A >= B) {
            System.out.println("A is latgest of");

        } else {
            System.out.println("B is largest of");
        }

        // 2. print if a number of Odd or Even
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}