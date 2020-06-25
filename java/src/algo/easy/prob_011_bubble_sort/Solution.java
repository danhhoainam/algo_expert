package algo.easy.prob_011_bubble_sort;

import common.Printer;

/**
 * Time:
 *   best: O(n) the array is already sorted
 *   average: O(n^2) we use loops in loops -> N * N
 *   worst: O(n^2) we use loops in loops -> N * N
 * Space:
 *   O(1): we dont store anything
 */
public class Solution {
    public static void main(String[] args) {
        Printer.printIntArr(bubbleSort(new int[] { 4, 2, 4, 5, 66, 212, 13 }));
    }

    private static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return new int[] {};
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
