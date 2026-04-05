class Solution {
    public static boolean palindrome(int n) {

        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int digits = n % 10;
            revNum = (revNum * 10 ) + digits;
            n = n / 10;

        }

        return dup == revNum;
    }
}

public class Palindrom {
    public static void main(String[] args) {
        int n = 121;
        Solution obj = new Solution();

        if (obj.palindrome(n)) {
            System.out.println("palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }

}