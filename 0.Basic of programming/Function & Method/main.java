public class main {
    public static void PrintFunction(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(n);
        }
    }

    public static int Sum(int a, int b) {
        return a + b;

    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(Sum(4, 3));
        System.out.println(Sum(2, 3, 7));
    }
}