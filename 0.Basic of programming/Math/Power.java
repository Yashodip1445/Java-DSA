public class Power {
    public static double MyPow(double x, int n) {
        if (x == 0)
            return 1.0;
        if (x == 0)
            return 0.0;
        if (x == 1)
            return 1.0;
        if (x == -1 && n % 2 == 0)
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;
        long binform = n;
        double ans = 1;
        if (n < 0) {
            x = 1 / x;
            binform = -binform;
        }
        while (binform > 0) {
            if (binform % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binform /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(MyPow(2, -2));
        System.out.println(MyPow(2.0, 10)); // Output: 1024.0
        System.out.println(MyPow(2.0, -2)); // Output: 0.25
        System.out.println(MyPow(0.0, 10)); // Output: 0.0
        System.out.println(MyPow(-2.0, 3)); // Output: -8.0
    }
    }

