public class Factorial {

    public static void Fact(int n) {

        if (n == 0) {
            return 1;
        }

        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;

    }

    public static void main(String[] args) {
        int n = 5;
       Fact(n);
    }
}
/*
 * n! = n*(n-1)! -> f(n)= n * f(n-1).............
 * 
 * 
 * 0! = 1
 * 
 */