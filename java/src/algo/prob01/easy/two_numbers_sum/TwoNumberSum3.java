package algo.prob01.easy.two_numbers_sum;

import common.Printer;

import java.util.Arrays;

/**
 * O(1) space
 * O(n logn) time
 */
public class TwoNumberSum3 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{ 1, 2, 3, 4, -4, 9}, 10);
        Printer.printIntArr(result);
    }

    private static int[] solution(int[] array, int targetSum) {
        Arrays.sort(array); // O(n)
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex < lastIndex) {
            int sum = array[firstIndex] + array[lastIndex];
            if (sum == targetSum) {
                return new int[] {array[firstIndex], array[lastIndex]};
            } else if (sum > targetSum) {
                lastIndex--;
            } else {
                firstIndex++;
            }
        }

        return new int[0];
    }
}
