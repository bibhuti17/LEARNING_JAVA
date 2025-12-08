public class Palindrome {
    public static void main(String[] args) {
//        we can reverse and use .equals method
//        using two pointers
        String checkPalindrome = "abdbga";
        System.out.println(isPalindrome(checkPalindrome));;

    }
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
