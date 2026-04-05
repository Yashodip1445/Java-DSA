class PrimeCheck {
    public static void main(String[] args) {
        int n = 60;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }

    @Override
    public String toString() {
        return "PrimeCheck []";
    }
}