public class GCD {
    public static int GCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            if (a == 0)
                return b;
        }
        return a;
    }

    // recursion
    public static int GCDRec(int a, int b) {
        if (b == 0)
            return a;
        return GCDRec(b, a % b);
    }
    // LCM 
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        System.out.println(GCD(20, 28));
        System.out.println(GCDRec(20, 28));
        System.out.println(LCM(20, 28));
    }
}
