package algo.prob01.easy.two_numbers_sum;

import common.Printer;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n) space
 * O(n) time
 */
public class TwoNumberSum1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{ 1, 2, 3, 4, -4, 9}, 10);
        Printer.printIntArr(result);
    }

    private static int[] solution(int[] array, int targetSum) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int item : array) {
            int otherNumber = targetSum - item;
            if (map.containsKey(otherNumber)) {
                return new int[] { item, otherNumber };
            } else {
                map.put(item, true);
            }
        }

        return new int[0];
    }
}
