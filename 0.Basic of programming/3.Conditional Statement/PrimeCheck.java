public class PrimeCheck {
    public static void main(String[] args) {
        int num = 30;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}


