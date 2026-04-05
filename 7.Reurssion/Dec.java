public class Dec {

    public static void PrintDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        PrintDec(n - 1);
    }

    public static void main(String[] args) {

        /*
         * Simple code
         * 
         * int n = 10 ;
         * for (int i= 10; i >=1; i--){
         * System.out.print(" "+ i);
         * }
         * 
         */

        // resursion
        int n = 10;
        PrintDec(n);

    }

}
