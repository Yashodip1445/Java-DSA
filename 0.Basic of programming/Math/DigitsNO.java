public class DigitsNO {
    public static void PrintDigits(int n) {
        int count = 0;
        int sum = 0;
        while (n != 0) {

            int digits = n % 10;
            System.out.println(digits);
            sum += digits;
            n = n / 10;
            count++;
        }
        System.out.println("Total digits = " + count );
        System.out.println("Total Sum = " + sum );
        double logValue = Math.log10(n); // {{ edit_7 }}
        System.out.println("Log10 of original number: " + logValue);
    }

    public static void main(String[] args) {
        int n = 3568;

        PrintDigits(n);
    }
}
