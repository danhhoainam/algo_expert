package algo.easy.prob_014_palindrome;

/**
 * O(n) time: we have to check N/2 times -> N
 * O(1) space: no need to store extra space
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("abcdcba: " + isPalindrome("abcdcba"));

        System.out.println("abcd: " + isPalindrome("abcd"));

        System.out.println("a: " + isPalindrome("a"));

        System.out.println("empty: " + isPalindrome(""));

        System.out.println("abccba: " + isPalindrome("abccba"));
    }

    private static boolean isPalindrome(String str) {
        int length = str.length();
        int middle = length / 2;

        for (int i = 0; i < middle; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
