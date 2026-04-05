import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();   // digit
        int N = sc.nextInt();   // number of terms

        int term = 0;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            term = term * 10 + X;
            sum = sum + term;
        }

        System.out.println(sum);
    }
}
