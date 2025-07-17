public class BinomialCoefficent {
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int BinCoff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);
        int BinCoff = fact_n / (fact_r * fact_nmr);

        return BinCoff;
    }

    public static void main(String[] args) {
        System.out.println(BinCoff(5, 2));
    }
}
