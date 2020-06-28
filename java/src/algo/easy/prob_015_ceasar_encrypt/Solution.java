package algo.easy.prob_015_ceasar_encrypt;

public class Solution {
    public static void main(String[] args) {
        System.out.println(encrypt("abcxyz", 3));
    }

    private static String encrypt(String origin, int key) {
        String result = "";

        for (int i = 0; i < origin.length(); i++) {
            int newPos = (((int) origin.charAt(i)) + key - 97) % 26 + 97;
            result += ((char) newPos);
        }

        return result;
    }
}
