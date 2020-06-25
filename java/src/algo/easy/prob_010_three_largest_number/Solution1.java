package algo.easy.prob_010_three_largest_number;

import common.Printer;

import java.util.Arrays;

/**
 * O(n*logn) time: because we use array sort, the guaranteed time is O(n*logn)
 * O(1) space: we don't store anything extra
 */
public class Solution1 {
    public static void main(String[] args) {
        Printer.printIntArr(threeLargestNumbers(new int[] { 5, 1, 3, 6, 123, 5 }));
    }

    private static int[] threeLargestNumbers(int[] array) {
        if (array.length < 3) {
            return new int[] {};
        }
        Arrays.sort(array);
        int len = array.length;
        return new int[] { array[len - 3], array[len - 2], array[len - 1] };
    }
}
