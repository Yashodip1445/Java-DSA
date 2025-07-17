import java.util.Scanner;

public class JavaBasic {
    public static void PrintSum() {
        System.out.println("Hello world");
        System.out.println("Hello Code Army ");

    }

    public static void calulatorSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        PrintSum();

        calulatorSum();

        // swap
        int a = 10;
        int b = 5;
        // value exchange
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b =" + b);
    }
}
