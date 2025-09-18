public class fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacci series ");
        int n = 10;
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}
