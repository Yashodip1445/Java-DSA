public class PrimeNO {

    public static void main(String[] args) {
        int n = 17; // You can change this value to test other numbers
        boolean isPrime = true;
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }
    }
}