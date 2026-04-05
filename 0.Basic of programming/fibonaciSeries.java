public class fibonaciSeries {
    public static void main(String[] args) {
        /*
         * 0+1= 1
         * 1+2= 3
         * 2+3 = 5
         * 3+5 = 8
         * 5+8 = 13
         * 
         * 
         * 
         */
      int n = 10;
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

    }
}

}