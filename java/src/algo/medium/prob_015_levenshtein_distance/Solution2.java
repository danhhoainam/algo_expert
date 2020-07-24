package algo.medium.prob_015_levenshtein_distance;

import common.Printer;

/**
 * Ideas: the idea is the same as the Solution1, but to save space, we store the smaller array
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(levenshteinDistance("zxcabc1", "yabcd"));
    }

    private static int levenshteinDistance(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        String small = len1 < len2 ? str1 : str2;
        String big = len1 >= len2 ? str1 : str2;

        int[] evenEdits = new int[small.length() + 1];
        int[] oddEdits = new int[small.length() + 1];

        for (int i = 0; i < small.length() + 1; i++) {
            evenEdits[i] = i; // this is the base case
        }

        int[] currentEdits;
        int[] previousEdits;
        for (int i = 1; i < big.length() + 1; i++) {
            if (i % 2 == 1) {
                currentEdits = oddEdits;
                previousEdits = evenEdits;
            } else {
                currentEdits = evenEdits;
                previousEdits = oddEdits;
            }
            currentEdits[0] = i;

            for (int j = 1; j < small.length() + 1; j++) {
                if (big.charAt(i - 1) == small.charAt(j - 1)) {
                    currentEdits[j] = previousEdits[j - 1];
                } else {
                    currentEdits[j] = 1 + Math.min(currentEdits[j - 1], Math.min(previousEdits[j], previousEdits[j - 1]));
                }
            }
        }

        return big.length() % 2 == 0 ? evenEdits[small.length()] : oddEdits[small.length()];
    }
}
