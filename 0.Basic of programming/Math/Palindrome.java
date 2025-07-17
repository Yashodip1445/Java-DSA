public class Palindrome {
    public static int reverse(int x) {
        int revNum = 0;
        while (x != 0) {
            int dig = x % 10;
            revNum = revNum * 10 + dig;
            x = x / 10;
        }
        return revNum;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int revNum = reverse(x);
        return x == revNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(7117));
    }
}
