public class phase {
    public static void main(String[] args) {
        System.out.println("Factorial NO ");

        /*
         * factorial of number
         * i = 1 fact = 1
         * i = 2 fact = 2
         * i = 3 fact = 6
         * i = 4 fact = 24
         * i = 5 fact = 120
         * i = 6 fact = 720
         * 
         */
        int n = 10;
        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }
        System.out.println("factorial of " + n + " = " + fact);
    }
}