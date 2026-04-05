//  prime or not

class Solution {
     public boolean checkPrime(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i without any remainder
            if (n % i == 0) {
                cnt++;  // Increment the counter
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt == 2;
    }
}
public class PrimeNo {
    public static void main(String args[]) {
     int n = 1483;  // Example number
        Solution obj = new Solution();
        boolean isPrime = obj.checkPrime(n);  // Function call to check if the number is prime

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}