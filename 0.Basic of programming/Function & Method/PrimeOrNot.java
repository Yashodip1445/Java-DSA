public class PrimeOrNot {
    public static Boolean isPrime(int n) {
        // // cornar case
        // // 2
        // if (n == 2) {
        // return true;
        // }
        // for (int i = 2; i <= n; i++) {
        // if (n % i == 0) { // Completely divinding

        // return false;

        // }
        // }
        // return true;
        // }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;

            }
        }
        return true;
    }
    // 2 print all primes in a Range n = 10 ( 2,3,5,7 )

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

      public static void main(String[] args) {
        // System.out.println(isPrime(2));
        PrimeInRange(10);
    }
}
