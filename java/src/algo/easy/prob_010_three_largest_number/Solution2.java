package algo.easy.prob_010_three_largest_number;

import common.Printer;

/**
 * O(n) time: we have to traverse the array
 * O(1) space: we are not using any additional memory
 */
public class Solution2 {
    public static void main(String[] args) {
        Printer.printIntArr(threeLargestNumbers(new int[] { 5, 1, 123, 3, 6, 7 }));
    }

    private static int[] threeLargestNumbers(int[] array) {
        int[] result = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int element : array) {
            findMax(element, result); // O(3*3*N) = O(N)
        }

        return result;
    }

    private static void findMax(int element, int[] maxArray) {
        if (element > maxArray[2]) {
            shiftLeftMaxArray(element, maxArray, 2);
        } else if (element > maxArray[1]) {
            shiftLeftMaxArray(element, maxArray, 1);
        } else if (element > maxArray[0]) {
            shiftLeftMaxArray(element, maxArray, 0);
        }
    }

    private static void shiftLeftMaxArray(int element, int[] maxArray, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                maxArray[i] = element;
            } else {
                maxArray[i] = maxArray[i + 1];
            }
        }
    }
}
