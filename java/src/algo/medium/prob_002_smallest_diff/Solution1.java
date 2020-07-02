package algo.medium.prob_002_smallest_diff;

import common.Printer;

/**
 * O(M*N) time: we use 2 loops inside each other
 * O(1) space: we dont need extra memory for operation
 */
public class Solution1 {

    public static void main(String[] args) {
        Printer.printIntArr(smallestDifference(new int[] {-1,5,10,20,28,3},new int[]{26,134,135,15,17}));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Integer min = Integer.MAX_VALUE;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int abs = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (abs < min) {
                    min = abs;
                    first = arrayOne[i];
                    second = arrayTwo[j];
                }
            }
        }

        return new int[] {first, second};
    }
}
