package algo.prob01.easy.two_numbers_sum;

import common.Printer;

import java.util.HashMap;
import java.util.Map;

/**
 * O(1) space
 * O(n^2) time
 */
public class TwoNumberSum2 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{ 1, 2, 3, 4, -4, 9}, 10);
        Printer.printIntArr(result);
    }

    private static int[] solution(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (first + second == targetSum) {
                    return new int[] { first, second };
                }
            }
        }

        return new int[0];
    }
}
