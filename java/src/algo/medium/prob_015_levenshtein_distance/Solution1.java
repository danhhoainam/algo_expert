package algo.medium.prob_015_levenshtein_distance;

/**
 * ideas: we solve problem by comparing each chars of one's string to the other's
 * O(mn) time: we have to check char by char
 * O(mn) space: we have to store comparision results in a 2 dimensional array
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(levenshteinDistance("zxcabc1", "yabcd"));
    }

    private static int levenshteinDistance(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] distance = new int[len2 + 1][len1 + 1]; // plus 1 to store the index column and row

        // initiate values for array
        for (int row = 0; row < len2 + 1; row++) {
            for (int col = 0; col < len1 + 1; col++) {
                distance[row][col] = col;
            }

            distance[row][0] = row;
        }

        // solve the problem
        for (int row = 1; row < len2 + 1; row++) {
            for (int col = 1; col < len1 + 1; col++) {
                if (str1.charAt(col - 1) == str2.charAt(row - 1)) {
                    distance[row][col] = distance[row - 1][col - 1];
                } else {
                    distance[row][col] = 1 + Math.min(distance[row - 1][col - 1],
                            Math.min(distance[row][col - 1], distance[row - 1][col]));
                }
            }
        }

        return distance[len2][len1];
    }
}
