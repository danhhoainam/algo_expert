package algo.medium.prob_012_max_subset;

public class Solution2 {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }

        int second = array[0];
        int first = Math.max(array[0], array[1]);
        for (int i = 0; i < array.length; i++) {
            int currentMax = Math.max(second, first + array[i]);
            second = first; // old max
            first = currentMax; // new max
        }

        return first;
    }
}
