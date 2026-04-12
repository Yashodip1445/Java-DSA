public class main {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if ((str.charAt(i)) != str.charAt(n - i - 1)) {
                // not palindrom
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // racecar , noon , madam ==> palindrme
        String str = "Yashodip";
        System.out.println(isPalindrome(str));
    }
}
